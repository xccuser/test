/**
 * 
 */
package com.xcc.mybatis;

import java.io.Serializable;

/**
 *  Administrator
 *
 */
public class Person implements Serializable{
	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	private Card crad;
	public Person() {
		super();
	}
	public Card getCard() {
		return crad;
	}
	public void setCrad(Card card) {
		this.crad = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", age=" + age + "]";
	}

}
