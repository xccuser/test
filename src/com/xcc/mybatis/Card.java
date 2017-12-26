package com.xcc.mybatis;

import java.io.Serializable;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 */
public class Card implements Serializable {
	private Integer id;
	private String code;
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
		return "Card [id=" + id + ", code=" + code + "]";
	}
	
}
