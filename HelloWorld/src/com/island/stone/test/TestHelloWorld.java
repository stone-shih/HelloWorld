package com.island.stone.test;

import org.junit.Test;

import com.island.stone.HelloWorld;

import static org.junit.Assert.*;

public class TestHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void testSimplePrintfInt() {
		
		HelloWorld hw = new HelloWorld(); 
		
		String result = hw.simpleSprintf("test%d", 5);
		assertEquals(result,"test5");
		
	}

	@Test
	public void testSimplePrintfStr() {
		
		HelloWorld hw = new HelloWorld(); 
		
		String result = hw.simpleSprintf("test%s", "5");
		assertEquals(result,"test5");
		
	}	
	
}
