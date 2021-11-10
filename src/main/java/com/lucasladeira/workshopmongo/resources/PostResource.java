package com.lucasladeira.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasladeira.workshopmongo.domain.Post;
import com.lucasladeira.workshopmongo.repositories.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostResource {
	
	@Autowired
	private PostRepository postRepository;
	
	@GetMapping
	public List<Post> findAll () {
		List<Post> list = postRepository.findAll();
		return list;
	}
}
