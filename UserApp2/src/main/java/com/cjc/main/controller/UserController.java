package com.cjc.main.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;

@RestController
public class UserController {
	
	@DeleteMapping("/deleteUser")
	public String deleteUser()
	{
		return "No User";
	}

	@PostMapping("/user")
	public void saveUser(@RequestBody User user)
	{
		System.out.println(user.getUid());
		System.out.println(user.getUname());
		System.out.println(user.getAge());
		System.out.println(user.getPassword());

	}
	@GetMapping("/user")
	public List<User> getalldata()
	{
		List<User> user=new ArrayList();
		
		return user;

	}

}
