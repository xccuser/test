/**
 * 
 */
package com.xcc.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.test.context.jdbc.Sql;

import com.xcc.mapper.EmployeeMapper;

/**
 *  Administrator
 *
 */
public class DynamicSQLTest {
	SqlSession session=FKSqlSessionFactory.getSqlSession();
	public static void main(String[] args) throws Exception{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sqlSessionFactory.openSession();
		DynamicSQLTest t=new DynamicSQLTest();
		t.testSelectEmployeeByLike(session);
		session.commit();
		session.close();
	}
	
	public void testSelectEmployeeByLike(SqlSession session){
		EmployeeMapper em=session.getMapper(EmployeeMapper.class);
		/*
		 * 两种方式获取对象HashMap，另一种property
		*/
		HashMap<String,Object> params=new HashMap<>();
	//	params.put("id", 2);
		List<Employee> list=em.selectEmployeeByIdLike(params);
		list.forEach(employee->System.out.println(employee));
	}
}
