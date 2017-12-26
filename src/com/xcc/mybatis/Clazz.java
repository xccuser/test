/**
 * 
 */
package com.xcc.mybatis;

import java.util.List;

public class Clazz {
	private Integer id;
	private String code;
	private String name;
	private List<Student> students;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudent() {
		return students;
	}
	public void setStudent(List<Student> students) {
		this.students = students;
	}
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
	
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", code=" + code + ",name="+name+"]";
	}
	

	
	
}
