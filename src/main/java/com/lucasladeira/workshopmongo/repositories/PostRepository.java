package com.lucasladeira.workshopmongo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.lucasladeira.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String text);	
	
	//montando querys personalizadas mongoDB
	@Query("{ $and: [ {date: {$gte: ?1} }, {date: {$lte: ?2} } , { $or: [ {'title': {$regex: ?0, $options: 'i' } }, {'body': {$regex: ?0, $options: 'i' } }, {'comments.text': {$regex: ?0, $options: 'i' } } ] } ] }")
	List<Post> fullSearch (String text, Date min, Date max);
}
