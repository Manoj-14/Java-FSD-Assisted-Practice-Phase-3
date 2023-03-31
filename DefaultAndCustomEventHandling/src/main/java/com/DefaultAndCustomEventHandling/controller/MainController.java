package com.DefaultAndCustomEventHandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DefaultAndCustomEventHandling.beans.CustomEventPublisher;

@Controller
public class MainController {

	@Autowired
	CustomEventPublisher cp;
	
	@RequestMapping(value = "/customevent", method = RequestMethod.GET)
	public String customEvent(ModelMap map) {
		cp.publish();
		cp.publish();
		
		return "customEvent" ;

	}
}
