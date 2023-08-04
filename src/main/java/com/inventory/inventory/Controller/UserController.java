package com.inventory.inventory.Controller;

import com.inventory.inventory.Model.User;
import com.inventory.inventory.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@GetMapping
	public ResponseEntity<List<User>> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping
	public ResponseEntity<User> insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}
}
