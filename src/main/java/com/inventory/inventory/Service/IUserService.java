package com.inventory.inventory.Service;

import com.inventory.inventory.Model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {
	ResponseEntity<User> insertUser(User user);

	ResponseEntity<List<User>> getAllUsers();
}
