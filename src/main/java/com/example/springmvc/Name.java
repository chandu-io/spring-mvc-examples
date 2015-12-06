package com.example.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("name")
public class Name {

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "namepage";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView post(final HttpServletRequest req, final HttpServletResponse res) {
		final ModelAndView mv = new ModelAndView("namepage");
		final ModelMap model = new ModelMap();
		model.put("name", req.getParameter("name-field"));
		mv.addAllObjects(model);
		return mv;
	}
}
