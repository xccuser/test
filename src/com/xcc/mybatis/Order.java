/**
 * 
 */
package com.xcc.mybatis;

import java.io.Serializable;
import java.util.List;

/**
 *  Administrator
 *
 */
public class Order implements Serializable{
	private Integer id;
	private String code;
	private Double total;
	private User user;
	private List<Article> articles;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", code=" + code + ", total=" + total + "]";
	}
	
}
