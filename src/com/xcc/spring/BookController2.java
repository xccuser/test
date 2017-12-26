package com.xcc.spring;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/json")
public class BookController2 {
	
	private static final Log logger = LogFactory.getLog(BookController2.class);
	
	@RequestMapping(value="/testRequest2Body")
	public void setJson(@RequestBody Book book,HttpServletResponse respone,
			HttpServletRequest request) 
			throws Exception{
		//InputStream in=request.getInputStream();
		//System.out.println(in.read());
		logger.info(JSONObject.toJSONString(book));
		book.setAuthor("肖文吉");
		respone.setContentType("text/html;charset=UTF-8");
		respone.getWriter().println(JSONObject.toJSONString(book));
	}
	
	
}
