/**
 * 
 */
package com.xcc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xcc.domain.User;


/**
 *  Administrator
 */
public interface UserMapper {
	User selectUserById(int id);
	List<User> selectAllUser();
	void deleteUserById(Integer id);
	
	@Select("select * from tb_user where loginname=#{loginname} and password=#{password}")
	User findWithLoginameAndPassword(
			@Param("loginname") String loginname,@Param("password")String password);
	
	
	
	
	
}
