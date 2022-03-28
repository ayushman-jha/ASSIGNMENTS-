package com.security.q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

	@GetMapping("/")
	public String helloPage() {
		return "hello";
	}

}
