package com.xcc.springjson;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xcc.spring.Book;

@Controller
@RequestMapping("/json")
public class BookController2 {
	static int i=0;
	@RequestMapping(value="/testRequest2Body")
	@ResponseBody
	public Object getJson(){
		List<Book> list=new ArrayList<Book>();
		list.add(new Book(1,"Spring MVC企业应用实战","肖文吉"));
		list.add(new Book(2,"Spring EE企业应用实战","李刚"));
		System.out.println(list.toString()+i++);
		return list;
	}
}



