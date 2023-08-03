package com.inventory.inventory.Service.Impl;

import com.inventory.inventory.Model.User;
import com.inventory.inventory.Repository.IUserRepository;
import com.inventory.inventory.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserRepository userRepository;

	@Override
	public User insertUser(User user)  {
		return userRepository.save(user);
	}
}
