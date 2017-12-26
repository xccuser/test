/**
 * 
 */
package com.xcc.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 *
 */
public class SelectMapTest {

	public static void main(String[] args){
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		List<Map<String,Object>> list=session.selectList("com.xcc.mybatis.UserMapper.selectAllUser");
		for(Map<String,Object> row : list){
			System.out.println(row);
		}
		session.commit();
		session.close();
	}
	








}
