package com.xcc.spring;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private static List<User> userList;
	public UserController(){
		super();
		userList=new ArrayList<User>();
	}

	private static final Log logger=LogFactory.getLog(UserController.class);

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String regsterForm(){
		logger.info("register GET...");
		return "registerForm";
	}

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(
			@RequestParam("loginname") String loginname,
			@RequestParam("password") String password,
			@RequestParam("username") String username){
		logger.info("register POST方法被调用。。。。");		
		User user=new User();
		user.setLoginname(loginname);
		user.setPassword(password);
		user.setUsername(username);
		userList.add(user);
		return "loginForm";
	}

	@RequestMapping("/login")
	public String login(
			@RequestParam("loginname") String loginname,
			@RequestParam("password")String password,
			Model model){
		logger.info("登录名："+loginname+"密码："+password);	
		for(User user:userList){
			if(user.getLoginname().equals(loginname)&&user.getPassword().equals(password)){
				model.addAttribute("user",user);
				return "welcome";
			}
		}
		return "loginForm";
	}

	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,String password,
			ModelAndView mv,HttpSession session){
		
		
		return null;	
	}






}
