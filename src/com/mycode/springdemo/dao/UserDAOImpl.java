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
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
						
		// create a query
	
		  Query<User> theQuery = currentSession.
		  createQuery("from User where userName=:userName AND password=:password",User.class); 
		  theQuery.setParameter("userName", login.getUserName());
		  theQuery.setParameter("password", login.getPassword());
		  List<User> list = theQuery.getResultList();
		  User user = null;

			if ((list != null) && (list.size() > 0)) {
				user = list.get(0); 		
			 }
			
				
		// execute query and get result list
		
		System.out.println("Result"+user.toString());
		return user;
	}

	@Override
	public List<User> getUsers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
	
		return null;
	}

}
