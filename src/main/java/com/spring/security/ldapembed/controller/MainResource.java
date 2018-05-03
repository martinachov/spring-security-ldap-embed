package com.spring.security.ldapembed.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/main")
public class MainResource {

	@RequestMapping("/check")
	public String check() {
		return "Check Works!!";
	}
	
}
