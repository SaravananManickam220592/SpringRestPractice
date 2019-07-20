package com.example.SpringRestExample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler{
	
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> handleProductNotFoundException(ProductNotFoundException exc){
		
		return new ResponseEntity<Object>(exc.getMessage(),HttpStatus.NOT_FOUND);
		
	}

}
