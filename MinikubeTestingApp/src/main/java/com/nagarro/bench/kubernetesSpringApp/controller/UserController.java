package com.nagarro.bench.kubernetesSpringApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	  
	  @GetMapping("/")
	  public String home() {
		  return "Running Kubernetes App Successfully !";
	  }
	  @GetMapping("/hello")
	  public String homehello() {
		  return "Hello World Running Kubernetes App Successfully !";
	  }
	  
	  
	  
 }
