package com.example.kagazkalam.kagazkalam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kagazkalam.kagazkalam.entity.Post;
import com.example.kagazkalam.kagazkalam.services.PostService;

@RestController
@RequestMapping(path = "/post")
public class PostController {
	
	@Autowired
	public PostService postservice;
	
	@GetMapping(path = "/getall")
	public List<Post> getall() {
		return this.postservice.getall();
	}
	
	@PostMapping(path="/add")
	public Post add(@RequestBody Post post) {
		return this.postservice.add(post);
	}
	
	@DeleteMapping(path = "/delete")
	public long delete(@RequestBody long id ) {
		return this.postservice.delete(id);
	}
	
	@PutMapping(path="/update")
	public Post update(@RequestBody Post post) {
		return this.postservice.update(post);
	}
}
