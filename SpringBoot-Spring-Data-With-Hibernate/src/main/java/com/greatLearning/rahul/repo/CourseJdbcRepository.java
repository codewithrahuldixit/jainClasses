package com.greatLearning.rahul.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	 @Autowired
	private JdbcTemplate jdbctemplate;
	private static String insert_query = """

				insert into Course (id, name, author)
				values (?,?,?);

			""";
	private static String delete_query = """

				delete from course where id = ?;

			""";
	private static String select_query = """

				select * from course where id = ?;

			""";
	private static String select_query_list = """

			select * from course where author = ?;

			""";
	private static String select_query_all = """

			select * from course;

			""";
	public void insert(Course course) {
		jdbctemplate.update(insert_query, course.getId(), course.getName(), course.getAuthor());
	}

	public void deleteById(int id) {
		jdbctemplate.update(delete_query, id);
	}

	public Course findById(int id) {
		// TODO Auto-generated method stub
		return jdbctemplate.queryForObject(select_query,
				// Create a new BeanPropertyRowMapper
				// , accepting unpopulatedproperties in the target bean.
				new BeanPropertyRowMapper<>(Course.class), id);
	}

	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return jdbctemplate.query(select_query_all,
				// Create a new BeanPropertyRowMapper
				// , accepting unpopulatedproperties in the target bean.
				new BeanPropertyRowMapper<>(Course.class));
	}

}
