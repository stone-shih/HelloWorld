package com.island.stone.test;

import org.junit.Test;

import com.island.stone.pojo.dao.ContinentDao;

import org.junit.Assert;
import java.util.*;

@SuppressWarnings("unchecked")

public class testContinetDAO {
	
	@Test
	public void testFindAll() {
		List<ContinentDao>	l = null;
		ContinentDao	ctDao = new ContinentDao();	
		l = (List<ContinentDao>) ctDao.findAll();
		
		Assert.assertNotNull(l);
		Assert.assertNotEquals(0, l.size());
		
	}
	
	@Test
	public void testFindByAbbr() {
		List<ContinentDao>	l = null;
		ContinentDao	ctDao = new ContinentDao();	
		l = (List<ContinentDao>) ctDao.findByAbbr("AS");
		
		Assert.assertNotNull(l);
		Assert.assertNotEquals(0, l.size());
		
	}

}
