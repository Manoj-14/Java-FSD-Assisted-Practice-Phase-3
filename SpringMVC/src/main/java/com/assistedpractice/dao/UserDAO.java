package com.assistedpractice.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.assistedpractice.model.User;

public interface UserDAO {
	@Transactional
	void updateById(User user);

	User findById(int id);
	
	List<User> findAll();
}
