package com.xcc.mapper;

import com.xcc.mybatis.Person;

/**
 *  Administrator
 *
 */
public interface PersonMapper {
	Person selectPersonById(Integer id);
}
