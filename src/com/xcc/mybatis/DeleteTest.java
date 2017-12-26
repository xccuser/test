/**
 * 
 */
package com.xcc.mybatis;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 */
public class DeleteTest {

	public static void main(String[] args){
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		session.delete("com.xcc.mybatis.UserMapper.removeUser",1);
		session.commit();
		session.close();
	}	
}
