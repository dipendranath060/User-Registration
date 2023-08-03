package com.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{
//	public UserDetails createUser(UserDetails user);

}
