package com.boot100;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    private static final Logger logger = LoggerFactory.getLogger(Slf4jTest.class);  
	
	public static void main(String[] args) {
	     logger.info("slf4j test");
	}

}
