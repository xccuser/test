/**
 * 
 */
package com.xcc.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xcc.mapper.PersonMapper;



/**
 *  Administrator
 *
 */
public class OneToOneTest {

	public static void main(String[] args) throws Exception{
		InputStream inputStream=Resources
				.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sqlSessionFactory.openSession();
		PersonMapper pm=session.getMapper(PersonMapper.class);
		Person p=pm.selectPersonById(1);
		System.out.println(p);
		System.out.println(p.getCard());
		session.commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
