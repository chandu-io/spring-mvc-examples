package com.example.springmvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTodosDaoImpl implements TodosDao {

	private static final String INSERT_STMT = "INSERT INTO todos (task) VALUES ('%s')";
	private static final String SELECT_STMT = "SELECT task FROM todos";

	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@Override
	public void addTask(final String task) {
		jdbcTemplate.execute(String.format(INSERT_STMT, task));
	}

	@Override
	public List<String> getAllTasks() {
		return jdbcTemplate.queryForList(SELECT_STMT, String.class);
	}
}
