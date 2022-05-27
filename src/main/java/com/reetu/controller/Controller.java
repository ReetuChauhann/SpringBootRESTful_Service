package com.reetu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reetu.services.MyService;
import com.reetu.services.service;

@RestController
public class Controller {
	
	         @Autowired
	         MyService myservice;
	           
	      @RequestMapping("/")
	      public String home() {
	    	  return "Welcome to the welcome page";
	    	 
	      }

	      @RequestMapping("/hello")
	      public String hello() {
	    	  return "Hello RESTful API";
	      }
	      
	     @PostMapping("/add/{num1}/{num2}")
	     public int add(@PathVariable("num1") int a, @PathVariable("num2") int b ) {
	    	 int result = myservice.add(a, b);
	    	 return result;
	     }
}
