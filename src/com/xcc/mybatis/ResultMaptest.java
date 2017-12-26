/**
 * 
 */
package com.xcc.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 *
 */
public class ResultMaptest {

	public static void main(String[] args){
		SqlSession session =FKSqlSessionFactory.getSqlSession();
		List<User> user_list=session.selectList("com.xcc.mybatis.UserMapper.selectUser2");
		for(User user:user_list){
			System.out.println(user);
		}
		session.commit();
		session.close();
	}

}
