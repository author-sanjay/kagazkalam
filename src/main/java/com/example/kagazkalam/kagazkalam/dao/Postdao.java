package com.example.kagazkalam.kagazkalam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.kagazkalam.kagazkalam.entity.Post;

public interface Postdao extends JpaRepository<Post, Long>{

}
