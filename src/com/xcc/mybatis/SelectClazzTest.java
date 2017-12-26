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

public class SelectClazzTest {

	public static void main(String[] args){

		SqlSession session=FKSqlSessionFactory.getSqlSession();
		List<Clazz> clazz_list=session
				.selectList("com.xcc.mybatis.UserMapper.selectClazz");
		for(Clazz clazz:clazz_list){
			System.out.println(clazz);
			List<Student> student_list=clazz.getStudent();
			for(Student stu:student_list){
				System.out.println(stu.getId()+" "+
						stu.getName()+" "+stu.getSex()+" "+stu.getAge());
			}
		}
		session.commit();
		session.close();
	}
}
