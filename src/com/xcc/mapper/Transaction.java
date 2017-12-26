/**
 * 
 */
package com.xcc.mapper;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 *  Administrator
 *
 */
public interface Transaction {
	Connection  getConnection() throws SQLException;  
	void commit();
	void rollback() throws SQLException;
	void close() throws SQLException;
}
