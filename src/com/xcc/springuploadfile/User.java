package com.xcc.springuploadfile;


import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

// 域对象，实现序列化接口
public class User implements Serializable{


	private Integer id;			// id
	private String loginname;	// 登录名
	private String password;	// 密码
	private String username;	// 用户名
	private MultipartFile image;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password="
				+ password + ", username=" + username + "]";
	}

	
	
}
