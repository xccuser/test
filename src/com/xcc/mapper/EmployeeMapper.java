/**
 * 
 */
package com.xcc.mapper;

import java.util.HashMap;
import java.util.List;

import com.xcc.mybatis.Employee;

/**
 *  Administrator
 */
public interface EmployeeMapper {
	List<Employee> selectEmployeeByIdLike(HashMap<String,Object> param);
}
