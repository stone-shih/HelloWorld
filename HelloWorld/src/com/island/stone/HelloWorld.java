package com.island.stone;

import static java.lang.System.out;
import static java.lang.String.format;
import	com.island.stone.DbUtil.OracleDB;
import	java.sql.ResultSet;
import java.sql.SQLException;

public class HelloWorld {
	
	public static HelloWorld ob = new HelloWorld();
	
	public  String simpleSprintf(String fmt, Object arg) {
		String rtn="";
		rtn = format(fmt, arg);
		return rtn;
	}
	
	public static	void	printContinent() {
		
		ResultSet	rs = OracleDB.runQuery("select * from continent");
		
		
		try {
			while(rs.next()) {
				out.print(String.format("Continet: %s\n", rs.getString("name")));
				int i = rs.getInt("seq");
				ResultSet	rs1 = OracleDB.runQuery(
						"select * from cont_country where cont_seq = " + i
						);
				while(rs1.next()) {
					out.print(String.format("   Contry: %s\n", rs1.getString("name")));
					out.print(String.format("      population= %d\n", rs1.getInt("population")));

				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		printContinent();
		
	}

}
