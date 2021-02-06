package com.dev4j.users.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello")
public class Devs4jControllers {
	@GetMapping
	public String  helloWorld() {
		return "! Hello World";
	}
}
