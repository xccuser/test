package com.xcc.springuploadfile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	
	@RequestMapping(value="/main")
	public String main(Model model){
		List<Book> book_list=new ArrayList<>();
		book_list.add(new Book("java.jpg","疯狂java讲义（附光盘）","李刚 编著",74.2));
		book_list.add(new Book("ee.jpg","轻量级Java EE企业应用实战","李刚 编著",59.2));
		book_list.add(new Book("android.jpg","疯狂Android讲义（附光盘）","李刚 编著",60.6));
		book_list.add(new Book("ajax.jpg","疯狂Ajax讲义（附光盘）","李刚 编著",66.6));
		
		model.addAttribute("book_list", book_list);
		// 跳转到main页面
		return "main";
	}
}
