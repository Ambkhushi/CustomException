package com.project.employee.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class globalexception {
	@ExceptionHandler(usernotfoundexception.class)
    public ResponseEntity<String> handleuserexception(usernotfoundexception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
	
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<String> handleException(Exception e) {
	        return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }
}
