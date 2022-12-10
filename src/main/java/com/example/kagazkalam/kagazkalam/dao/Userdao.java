package com.example.kagazkalam.kagazkalam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kagazkalam.kagazkalam.entity.Users;

public interface Userdao extends JpaRepository<Users, String> {

}
