package com.island.stone.pojo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.island.stone.DbUtil.OracleDB;
import com.island.stone.pojo.ContCountry;
import java.util.List;
import java.util.ArrayList;

public class ContCountryDao {
	
	public	List<ContCountry>	findAll() {
		
		ResultSet	rs = OracleDB.runQuery("select * from cont_country");
		if ( rs == null ) return null;
		
		List<ContCountry>	rtn = new ArrayList<ContCountry>();
		
		try {
			while(rs.next()) {
				
				ContCountry	ct = new ContCountry();
				ct.setSeq(rs.getInt("seq"));
				ct.setCont_seq(rs.getInt("cont_seq"));
				ct.setAbbr(rs.getString("abbr"));
				ct.setName(rs.getString("name"));
				ct.setPopulation(rs.getInt("population"));
				
				rtn.add(ct);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rtn;
	}
	
	public List<ContCountry>	findAllByContSeq(int cont_seq) {
		
		ResultSet	rs = OracleDB.runQuery("select * from cont_country where cont_seq = " + cont_seq);
		if ( rs == null ) return null;
		
		List<ContCountry>	rtn = new ArrayList<ContCountry>();
		
		try {
			while(rs.next()) {
				
				ContCountry	ct = new ContCountry();
				ct.setSeq(rs.getInt("seq"));
				ct.setCont_seq(rs.getInt("cont_seq"));
				ct.setAbbr(rs.getString("abbr"));
				ct.setName(rs.getString("name"));
				ct.setPopulation(rs.getInt("population"));
				
				rtn.add(ct);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rtn;
		
	}

	public List<ContCountry>	findByContAbbr(String abbr) {
		
		ResultSet	rs = OracleDB.runQuery(
				"select * from cont_country  where cont_seq = (select seq from continent where abbr ='" + abbr +"' )");
		if ( rs == null ) return null;
		
		List<ContCountry>	rtn = new ArrayList<ContCountry>();
		
		try {
			while(rs.next()) {
				
				ContCountry	ct = new ContCountry();
				ct.setSeq(rs.getInt("seq"));
				ct.setCont_seq(rs.getInt("cont_seq"));
				ct.setAbbr(rs.getString("abbr"));
				ct.setName(rs.getString("name"));
				ct.setPopulation(rs.getInt("population"));
				
				rtn.add(ct);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return rtn;
		
	}

	
}
