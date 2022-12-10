package com.example.kagazkalam.kagazkalam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.kagazkalam.kagazkalam.entity.Post;

@Service
public interface PostService {

	List<Post> getall();

	Post add(Post post);

	long delete(long id);

	Post update(Post post);

}
