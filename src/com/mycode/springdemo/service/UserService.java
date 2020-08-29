package com.mycode.springdemo.service;

import java.util.List;

import com.mycode.springdemo.entity.Login;
import com.mycode.springdemo.entity.User;

public interface UserService {

	void register(User user);
	User validateUser(Login login);
	List<User> getUsers();
}
