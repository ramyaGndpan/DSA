package javatraining.assessments.day6;

import java.util.Properties;

/**
 * final Configuration
Develop a Configuration class that stores system configuration values as final fields. Implement a method to retrieve a specific configuration value by its key.
 * @author ramya
 *
 */
final class Configuration {

	private static final String APPLN_ENV = "DEV";
	private static final String DB_USERNAME = "POSTGRES";
	private static final String DB_PASSWORD = "POSTGRES123";
	private final Properties applnProp;
	

	public Configuration() {
		applnProp = new Properties();
		applnProp.setProperty("APPLN_ENV",APPLN_ENV);
		applnProp.setProperty("DB_USERNAME",DB_USERNAME);
		applnProp.setProperty("DB_PASSWORD",DB_PASSWORD);
	}
	
	public String getValue(String str) {
		return applnProp.getProperty(str);
	}
	
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		System.out.println("conf value::"+conf.getValue("APPLN_ENV"));
		System.out.println("conf value::"+conf.getValue("DB_USERNAME"));
		System.out.println("conf value::"+conf.getValue("DB_PASSWORD"));
	}
}

/**
Output:
conf value::DEV
conf value::POSTGRES
conf value::POSTGRES123

**/
