package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(RegistrationNotFoundException.class)
	public ResponseEntity<ErrorMessage>handleEmployeeNotFoundException(RegistrationNotFoundException ex){
		ErrorMessage error=new ErrorMessage();
		error.setErroecode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity(error,HttpStatus.OK);
	}
}
