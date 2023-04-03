package com.assistedpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.assistedpractice.dao.UserDAO;
import com.assistedpractice.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/users")
	public ModelAndView users() {
		ModelAndView mv = new ModelAndView();
		List<User> users = userDAO.findAll();
		System.out.println(users);
		mv.addObject("users",users);
		mv.setViewName("users");
		return mv;
	}

	@RequestMapping("/update")
	public ModelAndView updateUser(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		userDAO.updateById(user);
		List<User> users = userDAO.findAll();
		mv.addObject("users",users);
		mv.setViewName("users");
		return mv;
	}
	
	@RequestMapping("/find")
	public ModelAndView findUser(@ModelAttribute("id") int id) {
		ModelAndView mv = new ModelAndView();
		User user = userDAO.findById(id);
		mv.addObject("user",user);
		List<User> users = userDAO.findAll();
		mv.addObject("users",users);
		mv.setViewName("users");
		return mv;
	}
}
