package com.island.stone.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class OracleDB {
	
	private	static	Connection	conn = null;
	
	public	static	Connection getConnection() {
		Connection c = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		if ( conn == null ) {
			 String url = "jdbc:oracle:thin:stone/qwer1234@localhost:1521:xe";
	         try {
				c = DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			c = conn;
		}
		
		return c;
	}
	
	public	static ResultSet runQuery(String sql) {
		
		ResultSet	rtn=null;
		Connection	c =	getConnection() ;
		try {
			Statement stmt = c.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			rtn = rset;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rtn;
	}
	
	

}
