package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.experimental.StandardException;

@ControllerAdvice
public class UserExceptionHandler {
	@ExceptionHandler(value = { UserNotFoundException.class })
//	private static final String UserException = null;

	public ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		UserException userException = new UserException(userNotFoundException.getMessage(),
				userNotFoundException.getCause(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(userException, HttpStatus.NOT_FOUND);

	}

}
