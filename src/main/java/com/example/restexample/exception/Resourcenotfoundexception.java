package com.example.restexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Resourcenotfoundexception extends RuntimeException {
	public Resourcenotfoundexception(String msg) {
		super(msg);
	}

}
