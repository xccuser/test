/**
 * 
 */
package com.xcc.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 *  Administrator
 * 学生关联班级查询
 */
public class SelectStudentTest {

	public static void main(String[] args){
		SqlSession session=FKSqlSessionFactory.getSqlSession();
		List<Student> student_list=session
				.selectList("com.xcc.mybatis.UserMapper.selectStudent"); 
		for(Student stu:student_list){
			System.out.println(stu);
		}
		session.commit();
		session.close();
	}
}
