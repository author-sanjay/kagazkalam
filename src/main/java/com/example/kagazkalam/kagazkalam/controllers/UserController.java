package com.example.kagazkalam.kagazkalam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kagazkalam.kagazkalam.entity.Users;
import com.example.kagazkalam.kagazkalam.services.Userservice;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	public Userservice userservice;
	
	@GetMapping(path = "/getall")
	public List<Users> getallusers(){
		return this.userservice.getallusers();
	}
	
	@PostMapping(path = "/add")
	public Users addusers(@RequestBody Users user) {
		return this.userservice.addUser(user);
	}
	
	
}
