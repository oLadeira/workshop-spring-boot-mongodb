package com.lucasladeira.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucasladeira.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
