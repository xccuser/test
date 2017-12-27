/**
 * 
 */
package com.xcc.mapper;

import java.util.List;

import com.xcc.mybatis.User;

/**
 *  Administrator
 *
 */
public interface UserMapper {
	User selectUserById(int id);
	List<User> selectAllUser();
	void deleteUserById(Integer id);
}
