package com.constants;

public abstract class Constants {

	public static final String CURRENT_DIR = System.getProperty("user.dir");  //return path of current working directory
	
	public static final String EXECUTATION_REPORT_PATH = CURRENT_DIR+"/reports/execution.html";
	
	public static final int EXPLICIT_WAIT_TIME = 20;
	
	public static final String CONFIG_FILE_PATH = CURRENT_DIR+"/src/test/resources/execution/config.properties";
}
