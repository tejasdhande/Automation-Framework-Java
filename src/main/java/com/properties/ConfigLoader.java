package com.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.constants.Constants;
import com.report.ExtentFactory;

public class ConfigLoader {
	
	private Logger logger = LogManager.getLogger(ConfigLoader.class);
	
	private Properties prop;  // reference variable for properties class
	
	// Single tone design pattern 
	
	private ConfigLoader() {
		
		FileReader reader = null;
		try {
			reader = new FileReader(Constants.CONFIG_FILE_PATH);
		} catch (FileNotFoundException e) {
			
			logger.error("Exception occured while reading config file");
			ExtentFactory.getInstance().failTest("Exception occured while reading config file");
		}
		
		prop = new Properties();
		try {
			prop.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Constants.EXECUTION_ENV = getPropertyValue("environment");
	}
	
	private static ConfigLoader instance = new ConfigLoader();  // instance for this class
	
	// got calling object
	public static ConfigLoader getInstance() {
		return instance;
	}

	public String getPropertyValue(String Key) {
		return prop.getProperty(Key);
	}
	

}
