package com.xcc.springuploadfile;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,String password,
			ModelAndView mv,HttpSession session){
		if(loginname!=null && loginname.equals("fkit")
				&& password!=null && password.equals("123456")){
			User user=new User();
			user.setLoginname(loginname);
			user.setPassword(password);
			user.setUsername("管理员");
			session.setAttribute("user", user);
			mv.setViewName("redirect:main");
		}else{
			mv.addObject("message","登录名或密码错误，请重新输入！");
			mv.setViewName("loginForm");
		}		
		return mv;
	}
	
	
	
}
