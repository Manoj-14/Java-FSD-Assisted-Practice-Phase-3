package com.assistedpractice.SpringJDBC.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assistedpractice.SpringJDBC.dao.EProductDAO;
import com.assistedpractice.SpringJDBC.entity.Eproduct;

public class EproductController {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/assistedpractice/SpringJDBC/springConfig.xml");
		Eproduct product = new Eproduct(1, "Product1", 12000);
		EProductDAO productDAO = (EProductDAO) context.getBean("productdao");
		System.out.println("Inserted :"+productDAO.create(product));
	}
}
