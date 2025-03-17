package com.example.restexample.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class Hello {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	@PostMapping("/add")
	public void add() {
		
	}

}
