package com.xcc.mapper;

import com.xcc.mybatis.Student;

/**
 *  Administrator
 *
 */
public interface StudentMapper {
	Student selectStudentById(Integer id);
}
