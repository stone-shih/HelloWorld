package com.island.stone.test;

import org.junit.Test;

import com.island.stone.pojo.dao.ContCountryDao;
import com.island.stone.pojo.ContCountry;


import org.junit.Assert;
import java.util.*;


public class testContCountryDAO {
	
	@Test
	public void testFindAll() {
		
		List<ContCountry>	l = null;
		ContCountryDao	ctDao = new ContCountryDao();	
		l = (List<ContCountry>) ctDao.findAll();
		
		Assert.assertNotNull(l);
		
	}
	
	@Test
	public void testFindByAbbr() {
		
		List<ContCountry>	l = null;
		ContCountryDao	ctDao = new ContCountryDao();	
		l = (List<ContCountry>) ctDao.findByContAbbr("AS");
		
		Assert.assertNotNull(l);
		Assert.assertNotEquals(0, l.size());
		
	}
}
