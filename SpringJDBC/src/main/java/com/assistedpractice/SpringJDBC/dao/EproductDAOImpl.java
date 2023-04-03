package com.assistedpractice.SpringJDBC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.assistedpractice.SpringJDBC.entity.Eproduct;

@Component("productdao")
public class EproductDAOImpl implements EProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int create(Eproduct product) {
		String sql = "insert into eproduct values(?,?,?)";
		int res = jdbcTemplate.update(sql, product.getId(), product.getName(), product.getPrice());
		return res;
	}

	@Override
	public void update(Eproduct product) {
		// TODO Auto-generated method stub

	}

}
