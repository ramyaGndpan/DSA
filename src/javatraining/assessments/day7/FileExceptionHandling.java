package javatraining.assessments.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 File Handling and Exceptions
Write a program that reads data from a text file named data.txt. 
Each line of the file contains an integer. Calculate the sum of all integers in the file. 
Handle exceptions that may occur during file reading and parsing. 
Make use of the try-with-resources statement to ensure proper file closure. 
 * @author ramya
 *
 */
public class FileExceptionHandling {

	/**
	 * readFile()
	 */
	public static void readFile() {
		try(InputStream is = FileExceptionHandling.class.getClassLoader().getResourceAsStream("data.txt");
			BufferedReader bfr = new BufferedReader(new InputStreamReader(is));) 
		{
			String strLine;
			int result=0;

			while((strLine=bfr.readLine())!=null) {
				System.out.println("file contents::"+strLine);
				result = result + Integer.parseInt(strLine);
			}
		System.out.println("total sum:::"+result);
		}
		catch(NumberFormatException numberformatEx) {
			System.out.println("Error while converting file content to integer value......");
			numberformatEx.printStackTrace();
		}
		catch(IOException ioex) {
			System.out.println("Error while reading data file....");
			ioex.printStackTrace();
		}
		catch(Exception ex) {
			System.out.println("Exception occured.....");
			ex.printStackTrace();
		}
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		FileExceptionHandling.readFile();
	}
}

/**
 * Output
 * 
file contents::10
file contents::20
file contents::30
file contents::40
total sum:::100
------- 
file contents::10
file contents::20
file contents::30
file contents::40
file contents::wer
Error while converting file content to integer value......
java.lang.NumberFormatException: For input string: "wer"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at javatraining.assessments.day7.FileExceptionHandling.readFile(FileExceptionHandling.java:32)
	at javatraining.assessments.day7.FileExceptionHandling.main(FileExceptionHandling.java:55)
----

file contents::10
file contents::20.00
Error while converting file content to integer value......
java.lang.NumberFormatException: For input string: "20.00"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
	at java.base/java.lang.Integer.parseInt(Integer.java:652)
	at java.base/java.lang.Integer.parseInt(Integer.java:770)
	at javatraining.assessments.day7.FileExceptionHandling.readFile(FileExceptionHandling.java:32)
	at javatraining.assessments.day7.FileExceptionHandling.main(FileExceptionHandling.java:55)

	
	
**/
	
