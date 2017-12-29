/**
 * 
 */
package com.xcc.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.SelectProvider;

import com.xcc.mybatis.Employee;

/**
 *  Administrator
 */
public interface EmployeeMapper {
	
	List<Employee> selectEmployeeByIdLike(Map<String,Object> param);
	@SelectProvider(type=EmployeeDynaSqlProvider.class,method="selectWhitParam")
	List<Employee> selectWhitParam(Map<String,Object> param);
}
