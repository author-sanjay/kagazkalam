package com.example.kagazkalam.kagazkalam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.kagazkalam.kagazkalam.entity.Users;

@Service
public interface Userservice {

	List<Users> getallusers();

	Users addUser(Users user);

}
