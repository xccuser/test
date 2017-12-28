/**
 * 
 */
package com.xcc.mybatis;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 *
 */
public class InsertTest {

	public static void main(String[] args){
		SqlSession session =FKSqlSessionFactory.getSqlSession();
		UserMapper um=session.getMapper(UserMapper.class);
		User1 user=new User1();
		user.setName("test");
		user.setSex("男");
		user.setAge(18);
		um.saveUser1(user);
		System.out.println(user.getId());
		session.commit();
		session.close();
	}
	
	
}
