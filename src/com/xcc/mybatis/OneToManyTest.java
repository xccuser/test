/**
 * 
 */
package com.xcc.mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xcc.mapper.ClazzMapper;
import com.xcc.mapper.StudentMapper;

/**
 *  Administrator
 *
 */
public class OneToManyTest {

	public static void main(String[] args) throws Exception{
		InputStream inputStream=Resources
				.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder()
				.build(inputStream);
		SqlSession session=sqlSessionFactory.openSession();
		OneToManyTest t=new OneToManyTest();
	//	t.testSelectClazzById(session);
		t.testSelectStudentById(session);
		session.commit();
		session.close();
	}
	
	public void testSelectClazzById(SqlSession session){
		ClazzMapper cm=session.getMapper(ClazzMapper.class);
		Clazz clazz=cm.selectClazzById(1);
		System.out.println(clazz.getId()+" "+
		clazz.getCode()+" "+clazz.getName());
		List<Student> students=clazz.getStudents();
			for(Student stu:students){
				System.out.println(stu);
			}
	}
	
	public void testSelectStudentById(SqlSession session){
		StudentMapper sm=session.getMapper(StudentMapper.class);
		Student stu=sm.selectStudentById(1);
		System.out.println(stu);
		System.out.println(stu.getClazz());
	}
}
