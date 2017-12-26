/**
 * 
 */
package com.xcc.mybatis;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 *
 */
public class SelectTest {
	public static void main(String[] args){
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		User user=session.selectOne("com.xcc.mybatis.UserMapper.selectUser",4);
		System.out.println(user);
		session.commit();
		session.close();
	}
}
