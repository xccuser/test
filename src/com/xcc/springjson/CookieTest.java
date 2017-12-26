package com.xcc.springjson;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CookieTest {
	private Log logger=LogFactory.getLog(CookieTest.class);
	@RequestMapping("/cookie")
	public void cookieValueTest(@CookieValue(value="JSESSIONID",defaultValue="") 
	String sessionId ){
		logger.info(sessionId);
	}
	
	
}
