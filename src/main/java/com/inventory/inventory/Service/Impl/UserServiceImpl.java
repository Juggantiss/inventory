package com.inventory.inventory.Service.Impl;

import com.inventory.inventory.Model.User;
import com.inventory.inventory.Repository.IUserRepository;
import com.inventory.inventory.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User insertUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public ResponseEntity<List<User>> getAllUsers() {
		try {
			List<User> users = userRepository.findAll();

			if (users.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
