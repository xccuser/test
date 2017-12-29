/**
 * 
 */
package com.xcc.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.xcc.mapper.EmployeeMapper;

/**
 *  Administrator
 *
 */
public class DynamicSQLTest {
	SqlSession session=FKSqlSessionFactory.getSqlSession();
	public static void main(String[] args) throws Exception{
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		DynamicSQLTest t=new DynamicSQLTest();
		t.testSelectWHitParam(em);
		session.commit();
		session.close();
	}
	
	public void testSelectEmployeeByLike(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		/*
		 * 两种方式获取对象HashMap，另一种property
		*/
		HashMap<String,Object> params=new HashMap<>();
		params.put("id", 2);
		List<Employee> list=em.selectEmployeeByIdLike(params);
		list.forEach(employee->System.out.println(employee));
	}
	
	public void testSelectWHitParam(EmployeeMapper em){
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("loginname", "jack");
		param.put("password","123456");
		List<Employee> list=em.selectWhitParam(param);
		System.out.println(list);
	}
	
}
