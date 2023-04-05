package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.beans.Quote;

@Controller
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {

		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://api.quotable.io/random", Quote.class);

		return quote.toString();
	}

}
