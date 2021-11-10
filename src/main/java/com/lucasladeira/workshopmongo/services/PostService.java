package com.lucasladeira.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasladeira.workshopmongo.domain.Post;
import com.lucasladeira.workshopmongo.repositories.PostRepository;
import com.lucasladeira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	
	public List<Post> findAll(){
		List<Post> posts = postRepository.findAll();
		return posts;
	}
	
	public Post findById(String id) {
		Optional<Post> opt = postRepository.findById(id);
		if (opt.isEmpty()) {
			throw new ObjectNotFoundException("Post Not Found");
		}
		Post post = opt.get();
		return post;
	}
	
	public List<Post> findByTitle(String text){
		return postRepository.findByTitleContainingIgnoreCase(text);
	}
	
}
