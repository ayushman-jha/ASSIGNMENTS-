package com.security.q6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TestController {

	int count = 0;

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping("/errort")
	public ModelAndView error() {
		if (count < 2) {
			count++;
			return new ModelAndView("login");
		}
		return new ModelAndView("error");
	}

}
