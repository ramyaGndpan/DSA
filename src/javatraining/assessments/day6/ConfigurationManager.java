package javatraining.assessments.day6;

import java.util.Properties;

/**
 * Singleton Design Pattern
Implement a Singleton class called ConfigurationManager, which stores application configuration settings. 
The class should have a private static instance variable and a static method getInstance() to retrieve the instance. 
Demonstrate how the Singleton pattern ensures that only one instance of ConfigurationManager can be created.
 * @author ramya
 *
 */
public class ConfigurationManager {

	//creating private static instance variable
	private static ConfigurationManager confManager;
	private static final Properties applnProp = new Properties();
	private static final String ENV = "DEV";
	private static final String DBNAME = "POSTGRES";
	private static final String DBPWD = "POSTGRES123";
	
	//making the constructor private
	private ConfigurationManager() {
		applnProp.setProperty("ENV", ENV);
		applnProp.setProperty("DBNAME", DBNAME);
		applnProp.setProperty("DBPWD", DBPWD);
		System.out.println("prop set::::"+applnProp.stringPropertyNames());
	}
	
	//creating static method to access the instance
	public static ConfigurationManager getInstance() {
		if(confManager==null) {
			System.out.println("instance created:::::::");
			confManager = new ConfigurationManager();
		}else {
			System.out.println("instance already exists....");
		}
		return confManager;
	}
	
	public static String getPropValue(String propName) {
		return applnProp.getProperty(propName);
	}
	
	public static void main(String[] args) {
		ConfigurationManager.getInstance();
		ConfigurationManager.getInstance();
		ConfigurationManager.getInstance();
		System.out.println("prop value::DBNAME::"+ConfigurationManager.getPropValue("DBNAME"));
	}
	
/**
 * output:
instance created:::::::
prop set::::[DBPWD, DBNAME, ENV]
instance already exists....
instance already exists....
prop value::DBNAME::POSTGRES
 */

}
