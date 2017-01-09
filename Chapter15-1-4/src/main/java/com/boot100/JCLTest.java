package com.boot100;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class JCLTest {
	
	private static final Log log = LogFactory.getLog(JCLTest.class);
	
	public static void main(String[] args) {
		log.info("JCL test");
		log.error("JCL error");
		if(log.isDebugEnabled()){
			log.debug("JCL debug");
		}
	}
}
