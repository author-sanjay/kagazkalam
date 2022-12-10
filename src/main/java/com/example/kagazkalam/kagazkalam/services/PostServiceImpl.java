package com.example.kagazkalam.kagazkalam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kagazkalam.kagazkalam.dao.Postdao;
import com.example.kagazkalam.kagazkalam.entity.Post;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	public Postdao postdao;

	@Override
	public List<Post> getall() {
		// TODO Auto-generated method stub
		return postdao.findAll();
	}

	@Override
	public Post add(Post post) {
		// TODO Auto-generated method stub
		return postdao.save(post);
	}

	@Override
	public long delete(long id) {
		// TODO Auto-generated method stub
		postdao.deleteById(id);;
		return id;
	}

	@Override
	public Post update(Post post) {
		// TODO Auto-generated method stub
		Optional<Post> post1=postdao.findById(post.getId());
		if(post1.isPresent()) {
			Post post2=post1.get();
			post2.setPost(post.getPost());
			postdao.save(post2);
			return post;
		}
		return null;
	}

}
