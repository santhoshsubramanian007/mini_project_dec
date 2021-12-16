package com.Runner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Pratice {
	
	// Factory Design Pattern
	
	static Logger log = Logger.getLogger(Pratice.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		log.debug("debug");
		
		log.info("information");
		
		log.warn("warn");
		
		log.error("error");
		
		log.fatal("fatal");
		
		
		
		}

}
