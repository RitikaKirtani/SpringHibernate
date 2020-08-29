package com.mycode.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycode.springdemo.dao.UserDAO;
import com.mycode.springdemo.entity.Login;
import com.mycode.springdemo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Transactional
	@Override
	public void register(User user) {
		userDAO.register(user);
		
	}

	@Override
	@Transactional
	public User validateUser(Login login) {
		
		return userDAO.validateUser(login);
	}

	@Override
	@Transactional
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}

}
