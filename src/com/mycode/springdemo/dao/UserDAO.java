package com.mycode.springdemo.dao;

import java.util.List;

import com.mycode.springdemo.entity.Login;
import com.mycode.springdemo.entity.User;

public interface UserDAO {

	void register(User user);
	User validateUser(Login login);
	List<User> getUsers();
}
