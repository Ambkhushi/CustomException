package com.custom.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.custom.exception.services.userservice;
import com.custom.exception.usernotfound.userexception;

@RestController
@RequestMapping("/users")
public class UserCont {
	@Autowired
private userservice userService;
	  @GetMapping("/{username}")
	    public String getUserByUsername(@PathVariable String username) {
	        try {
	            userService.findUserByUsername(username);
	            return "User Found";
	        } catch (userexception e) {
	            return e.getMessage();
	        }
	    }
}
