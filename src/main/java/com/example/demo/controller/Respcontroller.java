package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Respcontroller {
	
	@GetMapping("/name")
	public String getname() {
		return "shahrukh";
	}

}
