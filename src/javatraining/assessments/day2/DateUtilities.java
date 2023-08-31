package javatraining.assessments.day2;

public class DateUtilities {

	/**
	 * printYearsAndDays
	 * to calculate and print number of years and days for the passed parameter of long type 
	 * @param minutes
	 */
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println(minutes+" min:Invalid value:::Please enter the valid input..");
		}else {
			long minutesInAYear= 365 * 24 * 60;
			long minutesInADay = 24 * 60;
			long noOfYears = minutes/minutesInAYear;
			long noOfDays = (minutes % minutesInAYear)/minutesInADay;
			System.out.println(minutes+" min = "+noOfYears+" y and "+noOfDays+" d");
			}
		}
		
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		printYearsAndDays(400*24*60);
		printYearsAndDays(800*24*60);
		printYearsAndDays(-100);
		printYearsAndDays(40*24*60);
		printYearsAndDays(24*60);
		printYearsAndDays(4*60);
	}

}
