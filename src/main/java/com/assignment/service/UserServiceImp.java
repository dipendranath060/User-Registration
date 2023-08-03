package com.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.UserDetails;
import com.assignment.repository.UserRepository;
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails createUser(UserDetails user) {
		return userRepo.save(user);
	}
	
}

