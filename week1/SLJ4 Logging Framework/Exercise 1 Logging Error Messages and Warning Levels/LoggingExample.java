package com.bankapp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
	
	public static void main(String[] args) {
		System.out.println("=== Application Started ===");
		
		logger.error("This is an Error Message");
		logger.warn("This is an Warning Message");
	}
}
