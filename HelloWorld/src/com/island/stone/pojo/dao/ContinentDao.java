package com.island.stone.pojo.dao;

import	com.island.stone.DbUtil.OracleDB;
import	com.island.stone.pojo.*;
import 	java.sql.ResultSet;
import java.sql.SQLException;
import 	java.util.ArrayList;
import 	java.util.List;

@SuppressWarnings("rawtypes")	

public class ContinentDao {
	
	
	public	List	findAll() {
		
		ResultSet	rs = OracleDB.runQuery("select * from continent");
		if ( rs == null ) return null;
		
		List<Continent>	rtn = new ArrayList<Continent>();
		
		try {
			while(rs.next()) {
				
				Continent	ct = new Continent();
				ct.setSeq(rs.getInt("seq"));
				ct.setAbbr(rs.getString("abbr"));
				ct.setArea(rs.getInt("area"));
				ct.setDescription(rs.getString("description"));
				ct.setName(rs.getString("name"));
				
				rtn.add(ct);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rtn;
	}
	
	public	List	findByAbbr(String abbr) {

		ResultSet	rs = OracleDB.runQuery(
				"select * from continent where abbr='" + abbr + "'");
		if ( rs == null ) return null;
		
		List<Continent>	rtn = new ArrayList<Continent>();
		
		try {
			while(rs.next()) {
				
				Continent	ct = new Continent();
				ct.setSeq(rs.getInt("seq"));
				ct.setAbbr(rs.getString("abbr"));
				ct.setArea(rs.getInt("area"));
				ct.setDescription(rs.getString("description"));
				ct.setName(rs.getString("name"));
				
				rtn.add(ct);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		return rtn;
	}

}
