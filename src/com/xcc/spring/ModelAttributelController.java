package com.xcc.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModelAttributelController {

	@ModelAttribute("loginname")
	public String userModel(@RequestParam("loginname") String loginname){
		System.out.println(loginname);
		return loginname;
	}
	
	@RequestMapping(value="/login1")
	public String login1(){
		return "result1";
	}
	
}
