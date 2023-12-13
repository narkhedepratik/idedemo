package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;

@RestController
public class UserController {
	
	
	@GetMapping("/user")
	public List<User> getalldata()
	{
		List<User> user=new ArrayList<>();
		
		return user;
	}

}
