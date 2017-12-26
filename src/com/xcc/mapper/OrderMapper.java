/**
 * 
 */
package com.xcc.mapper;

import com.xcc.mybatis.Order;

/**
 *  Administrator
 *
 */
public interface OrderMapper {
	Order selectOrderById(int id);
}
