package com.boot100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LogbackTest.class);
	
	public static void main(String[] args) {
		logger.info("logback test");
	}

}
