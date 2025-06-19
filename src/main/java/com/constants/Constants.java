package com.constants;

public abstract class Constants {

	public static final String CURRENT_DIR = System.getProperty("user.dir");  //return path of current working directory
	
	public static final String EXECUTATION_REPORT_PATH = CURRENT_DIR+"/reports/execution.html";
	
	public static final int EXPLICIT_WAIT_TIME = 20;
	
	public static final int IMPLICIT_WAIT_TIME = 20;
	
	public static final String CONFIG_FILE_PATH = CURRENT_DIR+"/src/test/resources/execution/config.properties";
	
	public static String EXECUTION_ENV;
	
	public static final String TEST_ENV_DATA_FILE = CURRENT_DIR+"/src/test/resources/testData/test_data.properties";
	
	public static final String PROD_ENV_DATA_FILE = CURRENT_DIR+"/src/test/resources/testData/prod_data.properties";
}
