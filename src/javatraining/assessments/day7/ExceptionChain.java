package javatraining.assessments.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Exception Chains Write a program that reads data from a CSV file containing
 * employee records. Each record has fields for name, age, and salary. Implement
 * exception handling to catch and log any exceptions that may occur while
 * reading or parsing the file. Include exception chaining to provide more
 * context about the error.
 * 
 * @author ramya
 *
 */
public class ExceptionChain {

	public static void readFile() throws IOException, NumberFormatException, Exception {
		// String fileName = "G:\\Downloads\\Employee.xlsx";
		 String fileName = "G:\\Downloads\\data.txt";
		List<EmpInfo> empList = null;
		File file = new File(fileName);
		try (BufferedReader bfr = new BufferedReader(new FileReader(file))) {
			String strLine;
			empList = new ArrayList<EmpInfo>();
			EmpInfo empInfo;
			while ((strLine = bfr.readLine()) != null) {
				System.out.println("file contents::" + strLine);
				String[] arrEmp = strLine.split(",");
				if (null != arrEmp) {
					if (arrEmp.length == 3) {
						empInfo = new EmpInfo();
						empInfo.setName(arrEmp[0]);
						empInfo.setAge(Integer.parseInt(arrEmp[1]));
						empInfo.setSalary(Double.valueOf(arrEmp[2]));
						empList.add(empInfo);
					} else {
						throw new IOException("input file data::invalid format::...");
					}
				} else {
					System.out.println("arrEmp is null...invalid data format..");
				}
			}
		}
		System.out.println("total emp data size:::" + empList.size());
	}

	/**
	 * main
	 * 
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		try {
			ExceptionChain.readFile();
		} catch (IOException ioex) {
			throw new ArrayIndexOutOfBoundsException().initCause(ioex);
		} catch (NumberFormatException numberformatEx) {
			System.out.println("Error while converting file content to integer value......");
			numberformatEx.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception occured.....");
			ex.printStackTrace();
		}
	}

}

/**
Output:
file contents::ram34,50000
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: input file data::invalid format::...
	at javatraining.assessments.day7.ExceptionChain.main(ExceptionChain.java:60)
Caused by: java.io.IOException
	at javatraining.assessments.day7.ExceptionChain.readFile(ExceptionChain.java:43)
	at javatraining.assessments.day7.ExceptionChain.main(ExceptionChain.java:58)
-----
file contents::ram,34,50000
file contents::vas,45,50000
file contents::yash,34,40000
file contents::sam,34,40000
total emp data size:::4


**/


class EmpInfo {
	private String name;
	private int age;
	private double salary;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

