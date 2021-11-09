package com.lucasladeira.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasladeira.workshopmongo.domain.User;
import com.lucasladeira.workshopmongo.repositories.UserRepository;
import com.lucasladeira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService{

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> opt = userRepository.findById(id);
		if (opt.isEmpty()) {
			throw new ObjectNotFoundException("User not found!");
		}
		User user = opt.get();
		return user;
	}
	
}
