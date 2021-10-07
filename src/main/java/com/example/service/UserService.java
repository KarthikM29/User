package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.User;
import com.example.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.getAllUsers();
	}
	
	public User getUser(String id) {
		return userRepository.getUser(id);
	}
	
	public User addUser(User user) {
		return userRepository.addUser(user);
	}
	
	public User updateUser(User user) {
		return userRepository.updateUser(user);
	}
	
	public User deleteUser(String id) {
		return userRepository.deleteUser(id);
	}
	

}
