package com.example.demo.exception;

import lombok.Data;

@Data
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		
	}


	
	private static final long serialVersionUID = 1L;


}
