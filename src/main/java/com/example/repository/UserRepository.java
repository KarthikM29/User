package com.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dto.User;

@Repository
public class UserRepository {

	List<User> userList = new ArrayList<>();

	public List<User> getAllUsers() {
		return userList;
	}

	public User getUser(String city) {
		Optional<User> first = userList.stream().filter(u -> u.getCity().equals(city)).findFirst();
		if (first.isPresent()) {
			return first.get();
		} else {
			return new User();
		}
	}

	public User addUser(User user) {
		userList.add(user);
		return user;
	}

	public User updateUser(User user) {
		for (User u1 : userList) {
			if (u1.getId().equals(user.getId())) {
				u1.setName(user.getName());
				u1.setStreet(user.getStreet());
				u1.setCity(user.getCity());
				u1.setZipCode(user.getZipCode());
				return u1;
			}
		}
		return new User();
	}

	public User deleteUser(String city) {
		Optional<User> first = userList.stream().filter(u -> u.getCity().equals(city)).findFirst();
		if (first.isPresent()) {
			User user = first.get();
			userList.remove(user);
			return user;
		} else {
			return new User();
		}
	}
}
