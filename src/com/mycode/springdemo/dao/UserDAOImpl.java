package com.mycode.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycode.springdemo.entity.Login;
import com.mycode.springdemo.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	@Override
	public void register(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save customer to db
		currentSession.save(user);	

	}

	@Override
	public User validateUser(Login login) {
		List<User> list = getUsers();
		// create a query
		System.out.println("login"+login.getUserName()+login.getPassword());

		if (list.size()>0 ) {
			for(User u : list) {
			if(u.getUserName().equals(login.getUserName()) && u.getPassword().equals(login.getPassword()))
			{
				return u;
			}
			}
		}
		
		return null;
	}

	@Override
	public List<User> getUsers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query
		Query<User> theQuery = currentSession.createQuery("from Customer", User.class);
				
		// execute query and get result list
		List<User> users = theQuery.getResultList();
						
		// return the results		
		return users;
		
	}

}
