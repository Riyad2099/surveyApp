package com.survey.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/test")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

}
