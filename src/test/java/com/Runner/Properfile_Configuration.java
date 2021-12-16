package com.Runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Properfile_Configuration {
	
	//factory Design pattern
	
	static Logger log = Logger.getLogger(Properfile_Configuration.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Debug");
		
		log.info("information");
		
		log.warn("warn");
		
		log.error("Error");
		
		log.fatal("fatal");

	}

}
