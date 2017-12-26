package com.xcc.springuploadfile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 *  拦截所有必须实现HandlerInterceptor接口
 */



public class AuthorizationInterceptor implements HandlerInterceptor {

	/*
	该方法将在整个请求完成之后执行，主要作用是用于清理资源
	该方法也只能在当前Interceptor的preHandle方法的返回值为true的时候调用
	 */	

	private static final String[] IGNORE_URI={"/loginForm","/login"};


	@Override
	public void afterCompletion(HttpServletRequest request, 
			HttpServletResponse response, Object arg2, Exception arg3)
					throws Exception {
		System.out.println("AuthorizationInterceptor afterCompletion -->");
		
	}



	@Override
	public void postHandle(HttpServletRequest request, 
			HttpServletResponse response, Object arg2, ModelAndView arg3)
					throws Exception {
		System.out.println("AuthorizationInterceptor postHandle -->");
		
	}

	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object arg2) throws Exception {

		System.out.println("AuthorizationInterceptor preHandle -->");
		boolean flag=false;
		String servletPath=request.getServletPath();
		for(String s:IGNORE_URI)	
			if(servletPath.contains(s)){
				flag=true;
				break;
			}
		if(!flag){
			User user =(User) request.getSession().getAttribute("user");
			if(user==null){
				System.out.println("AuthorizationInterceptor拦截请求：");
				request.setAttribute("message", "请求登录在访问网站");
				request.getRequestDispatcher("loginForm").forward(request, response);
			}else{
				System.out.println("AuthorizationInterceptor放行请求：");
				flag=true;
			}
		}
		return flag;
	}






}
