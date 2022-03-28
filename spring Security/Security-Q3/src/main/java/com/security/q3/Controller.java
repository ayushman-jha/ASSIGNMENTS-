package com.security.q3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
