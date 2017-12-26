package com.xcc.spring;




import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloControl{

	 private static final Log logger = LogFactory
	            .getLog(HelloControl.class);
	 
	 /**
	  * org.springframework.web.bind.annotation.RequestMapping注解
	  * 用来映射请求的的URL和请求的方法等。本例用来映射"/hello"
	  * hello只是一个普通方法。
	  * 该方法返回一个包含视图路径或视图路径和模型的ModelAndView对象。
	  * */
	/* @RequestMapping(value="/hello")*/
	 public ModelAndView hello(){
		 logger.info("hello方法 被调用");
		 // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
		 ModelAndView mv = new ModelAndView();
		 //添加模型数据 可以是任意的POJO对象  
	     mv.addObject("message", "Hello World!");  
	     // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
	     mv.setViewName("/WEB-INF/content/welcome.jsp"); 
		// 返回ModelAndView对象。
		return mv;
	 }

}

