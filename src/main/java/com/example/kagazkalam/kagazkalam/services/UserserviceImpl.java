package com.example.kagazkalam.kagazkalam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kagazkalam.kagazkalam.dao.Userdao;
import com.example.kagazkalam.kagazkalam.entity.Users;

@Service
public class UserserviceImpl implements Userservice{

	@Autowired
	public Userdao userdao;
	
	@Override
	public List<Users> getallusers() {
		return userdao.findAll();
		
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		userdao.save(user);
		return user;
	}

}
