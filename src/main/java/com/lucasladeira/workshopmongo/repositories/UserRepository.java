package com.lucasladeira.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucasladeira.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
