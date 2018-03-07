package com.island.stone;

import static java.lang.System.out;
import static java.lang.String.format;

public class HelloWorld {
	
	public static HelloWorld ob = new HelloWorld();
	
	public  String simpleSprintf(String fmt, Object arg) {
		String rtn="";
		rtn = format(fmt, arg);
		return rtn;
	}

	public static void main(String[] args) {
		
		out.print(ob.simpleSprintf("Hello %s\n", "World!"));
		
	}

}
