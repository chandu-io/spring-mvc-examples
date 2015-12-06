package com.example.springmvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springmvc.dao.TodosDao;
import com.example.springmvc.web.viewobject.Todo;

@Controller
@RequestMapping("todo-list")
public class TodoList {

	private static final String VIEW_NAME = "todo-list-page";

	@Autowired
	protected TodosDao todosDao;

	@RequestMapping(method = RequestMethod.GET)
	public String getAllTasks(final Model model) {
		final List<String> tasks = todosDao.getAllTasks();
		model.addAttribute("todo", new Todo());
		model.addAttribute("tasks", tasks);
		return VIEW_NAME;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addTask(@ModelAttribute final Todo todo) {
		if (todo.getTask() != null) {
			final String task = todo.getTask().trim();
			if (!"".equals(task)) {
				todosDao.addTask(task);
			}
		}
		return "redirect:todo-list";
	}
}
