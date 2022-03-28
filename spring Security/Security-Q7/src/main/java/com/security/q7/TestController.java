package com.security.q7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
public class TestController {

	int count = 0;

	@RequestMapping("/")
	public ModelAndView defaultHome() {
		return new ModelAndView("home");
	}

	@RequestMapping("/user")
	public String user() {
		return "<h1>Welcome User</h1>";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
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
