package com.assistedpractice.SpringJDBC.dao;

import com.assistedpractice.SpringJDBC.entity.Eproduct;

public interface EProductDAO {
	int create(Eproduct product);

	void update(Eproduct product);

}
