package com.hand.connectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactoryTest {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory cf = ConnectionFactory.getFactory();
	
		Connection conn = cf.makeConnection();
		
		System.out.println(conn.getAutoCommit());
	}

}
