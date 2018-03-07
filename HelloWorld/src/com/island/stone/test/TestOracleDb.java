package com.island.stone.test;

import org.junit.Test;
import static	com.island.stone.DbUtil.OracleDB.getConnection;
import static	com.island.stone.DbUtil.OracleDB.runQuery;

import org.junit.Assert;
import java.sql.Connection;
import java.sql.ResultSet;


public class TestOracleDb {
	
	@Test
	public void testDbUtil() {
		
		Connection	dbConn = getConnection();	
		
		Assert.assertNotNull(dbConn);
		
	}
	
	@Test
	public	void	testRunQuery() {
		ResultSet	rr = null;
		rr	= runQuery("select * from continent");
		
		Assert.assertNotNull(rr);
	}

}
