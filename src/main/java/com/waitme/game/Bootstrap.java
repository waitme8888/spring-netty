package com.waitme.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Bootstrap {
	
	private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);
	public static ApplicationContext context;
	public static String configFilePath = "classpath:spring/applicationContext.xml";

	public static void main(String[] args) {
		log.info("srping netty game startup ...");
		if (args.length > 0) {
			configFilePath = args[0];
		}
		context = new FileSystemXmlApplicationContext(configFilePath);
	}
}
