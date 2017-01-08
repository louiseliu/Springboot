package com.boot100;

import java.util.logging.Logger;

public class LogTest {

	private static final Logger logger=Logger.getLogger(LogTest.class.getName());

	public static void main(String[] args){
	    logger.info("jdk logging test");
	}

}
