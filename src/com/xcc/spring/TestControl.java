package com.xcc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControl {
	
	 
	@RequestMapping("/hello")
	public String helloWorld(Model model){
		model.addAttribute("message","hello world");
		 return "welcome";
	}
	 
	
}
