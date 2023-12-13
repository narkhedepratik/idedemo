package com.cjc.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;

@RestController
public class UserController {
	
	@PostMapping("/user")
	public void saveUser(@RequestBody User user)
	{
		System.out.println(user.getUid());
		System.out.println(user.getUname());
		System.out.println(user.getAge());
		System.out.println(user.getPassword());
	}

}
