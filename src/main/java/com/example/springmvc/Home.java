package com.example.springmvc;

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
		model.put("msg", "Hello World!");
		model.put("dt", "Today is " + new Date());
		mv.addAllObjects(model);
		return mv;
	}

	@RequestMapping("info")
	public ModelAndView get2() {
		final ModelAndView mv = new ModelAndView("homepage");
		final ModelMap model = new ModelMap();
		model.put("msg", "Hi there!");
		model.put("dt", "Today is " + new Date());
		mv.addAllObjects(model);
		return mv;
	}
}
