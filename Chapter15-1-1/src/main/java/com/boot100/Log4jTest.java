package com.boot100;

import org.apache.log4j.Logger;

public class Log4jTest {

	private static final Logger logger=Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		
		if(logger.isDebugEnabled()){
			logger.debug("log4j test");
		}
	}

}
