package com.softtek.aplicacionspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping(value = "/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping(value = "/userForm")
	public String getUserForm() {
		return "user-form";
	}


}
