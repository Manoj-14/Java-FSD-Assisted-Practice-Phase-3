package com.assistedpractice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.assistedpractice.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void updateById(User user) {
		hibernateTemplate.update(user);
	}

	@Override
	public User findById(int id) {
		User user = hibernateTemplate.get(User.class, id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}

}
