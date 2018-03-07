package com.island.stone.test;

import org.junit.Test;

import com.island.stone.pojo.dao.ContinentDao;

import org.junit.Assert;
import java.util.*;


public class testContinetDAO {
	
	@Test
	public void testFindAll() {
		List<ContinentDao>	l = null;
		ContinentDao	ctDao = new ContinentDao();	
		l = (List<ContinentDao>) ctDao.findAll();
		
		Assert.assertNotNull(l);
		
	}

}
