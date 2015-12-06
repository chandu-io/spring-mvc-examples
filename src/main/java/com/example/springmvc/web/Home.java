package com.example.springmvc.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {

	@RequestMapping("home")
	public ModelAndView get() {
		final ModelAndView mv = new ModelAndView("homepage");
		final ModelMap model = new ModelMap();
		model.put("appName", "spring-mvc-examples");
		mv.addAllObjects(model);
		return mv;
	}

	@RequestMapping("today")
	public ModelAndView get2() {
		final ModelAndView mv = new ModelAndView("todaypage");
		final ModelMap model = new ModelMap();
		model.put("greetings", "Hi there!");
		model.put("today", new Date());
		mv.addAllObjects(model);
		return mv;
	}
}
