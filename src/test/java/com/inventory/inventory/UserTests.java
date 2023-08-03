package com.inventory.inventory;

import com.inventory.inventory.Model.User;
import com.inventory.inventory.Service.Impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTests {
	@Autowired(required = true)
	private UserServiceImpl userService;

	@Test
	void testInsert() {
		User user = new User();

		user.setName("Juan");
		user.setFirstLastName("Martinez");
		user.setSecondLastName("Lopez");
		user.setAge(23);
		user.setAddress("Av Ignacio Allende");
		user.setPhone("9711521165");

		userService.insertUser(user);
	}
}
