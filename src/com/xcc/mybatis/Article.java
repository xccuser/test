/**
 * 
 */
package com.xcc.mybatis;

import java.io.Serializable;
import java.util.List;


public class Article implements Serializable{
	private Integer id;
	private String name;
	private Double pricve;
	private String remark;
	private List<Order> order;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPricve() {
		return pricve;
	}
	public void setPrice(Double price) {
		this.pricve = price;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", price=" + pricve
				+ ", remark=" + remark + "]";
	}
}
