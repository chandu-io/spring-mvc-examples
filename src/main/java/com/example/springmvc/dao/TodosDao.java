package com.example.springmvc.dao;

import java.util.List;

public interface TodosDao {
	void addTask(String task);

	List<String> getAllTasks();
}
