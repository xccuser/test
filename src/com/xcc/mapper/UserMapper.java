/**
 * 
 */
package com.xcc.mapper;

import com.xcc.mybatis.User;

/**
 *  Administrator
 *
 */
public interface UserMapper {
	User selectUserById(int id);
}
