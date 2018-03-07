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

}
