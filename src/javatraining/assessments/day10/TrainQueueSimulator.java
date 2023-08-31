package javatraining.assessments.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Assignment 2: Simulate a Train Queue Develop a simulation of a train queue
 * where passengers can join the queue, board the train, and leave the queue
 * once they board. Use a LinkedList to manage the queue of passengers.
 * Implement methods to add passengers, board the train, and display the current
 * status of the queue.
 * 
 * @author ramya
 *
 */
public class TrainQueueSimulator {

	private static LinkedList<Passenger> passengerQueueList = new LinkedList<Passenger>();
	private static LinkedList<Passenger> trainBoardedList = new LinkedList<Passenger>();
	private static Scanner in = new Scanner(System.in);
	private static String strPassngrName = "", strDestn = "", strTravelDate = "", strtravelTime = "";
	private static double ticketFee = 200.0;
	private static int ticketId = 0;

	/**
	 * addPassengers
	 */
	public static void addPassengers() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			System.out.println("Do you want to add the passenger::");
			boolean flagAddPassenger = (in.next().equalsIgnoreCase("yes") ? true : false);
			if (flagAddPassenger) {
				while (flagAddPassenger) {
					System.out.println("Enter the Passenger name::");
					strPassngrName = in.next();
					System.out.println("Enter the travel destination:::");
					strDestn = in.next();
					System.out.println("Enter the travel date in MM/dd/yyyy format::");
					strTravelDate = in.next();
					System.out.println("Enter the travel time in hh:mm format::");
					strtravelTime = in.next();
					strTravelDate = strTravelDate + " " + strtravelTime;
					Passenger passenger = null;
					System.out.println("due date::" + strTravelDate);
					passenger = new Passenger(0, strPassngrName, strDestn, sdf.parse(strTravelDate), 0);
					passengerQueueList.add(passenger);
					System.out.println("Do you want to add the passenger::");
					flagAddPassenger = (in.next().equalsIgnoreCase("yes") ? true : false);
				}
				System.out.println("PASSENGER ADDED TO THE QUEUE SUCCESSFULLY::::::PASSENGER QUEUE LIST:::"
						+ passengerQueueList.toString());
			} else {
				throw new InputMismatchException("Please enter valid input::PASSENGER NOT ADDED SUCCESSFULLY:::");
			}
		} catch (ParseException e) {
			System.out.println(
					"Parsing exception:::Please enter the due date in valid date format:::PASSENGER NOT ADDED SUCCESSFULLY...");
			e.printStackTrace();
		} catch (InputMismatchException iex) {
			System.out.println(
					"InputMismatchException:::Please enter valid input::::PASSENGER NOT ADDED SUCCESSFULLY:::");
			iex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception occured::::PASSENGER NOT ADDED SUCCESSFULLY.:");
			ex.printStackTrace();
		}
	}

	/**
	 * add passengers to the queue joinQueue
	 */
	public static void joinQueue() {
		addPassengers();
	}

	/**
	 * boardTrain
	 */
	public static void boardTrain() {
		try {
			System.out.println("Do you want to board the passenger::");
			boolean flagBoardPassenger = (in.next().equalsIgnoreCase("yes") ? true : false);
			if (flagBoardPassenger) {
				while (flagBoardPassenger) {
					System.out.println("Enter the passenger Name to be boarded::");
					String passengerName = in.next();
					Iterator<Passenger> ite = passengerQueueList.iterator();
					while(ite.hasNext()) {
						Passenger passenger = ite.next();
						if (passenger.getName().equalsIgnoreCase(passengerName)) {
							Passenger passengerNew = passenger;
							passengerNew.setTicketId(++ticketId);
							ticketFee = ticketFee + 10;
							passengerNew.setTicketFee(ticketFee);
							trainBoardedList.add(passengerNew);
							//ite.remove();
							leaveQueue(passenger);
							System.out.println("passenger ticket updated::"+passengerNew.getTicketId()+" ticketfee::"+ticketFee);
						}
					}
					System.out.println("Do you want to board the passenger::");
					flagBoardPassenger = (in.next().equalsIgnoreCase("yes") ? true : false);
				}
				System.out.println("PASSENGER BOARDED TO THE QUEUE SUCCESSFULLY::::::PASSENGER BOARDED LIST:::"
						+ trainBoardedList.toString());
			} else {
				throw new InputMismatchException("Please enter valid input::PASSENGER NOT BOARDED SUCCESSFULLY:::");
			}
		} catch (InputMismatchException iex) {
			System.out.println(
					"InputMismatchException:::Please enter valid input::::PASSENGER NOT BOARDED SUCCESSFULLY:::");
			iex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception occured::::PASSENGER NOT BOARDED SUCCESSFULLY.:");
			ex.printStackTrace();
		}
	}

	/**
	 * leaveQueue
	 */
	public static void leaveQueue(Passenger passenger) {
		passengerQueueList.remove(passenger);
		System.out.println("PASSENGER removed from THE QUEUE SUCCESSFULLY::::");
	}

	/**
	 * displayQueue
	 */
	public static void displayQueue() {
		System.out.println("PASSENGER QUEUE LIST:::::::::"+passengerQueueList.toString());
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TrainQueueSimulator.joinQueue();
		TrainQueueSimulator.boardTrain();
		displayQueue();
	}

}

class Passenger {

	private int ticketId;
	private String name;
	private String destination;
	private Date travelDate;
	private double ticketFee;

	/**
	 * @param ticketId
	 * @param name
	 * @param destination
	 * @param travelDate
	 * @param ticketFee
	 */
	public Passenger(int ticketId, String name, String destination, Date travelDate, double ticketFee) {
		super();
		this.ticketId = ticketId;
		this.name = name;
		this.destination = destination;
		this.travelDate = travelDate;
		this.ticketFee = ticketFee;
	}

	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

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
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the ticketDate
	 */
	public Date getTravelDate() {
		return travelDate;
	}

	/**
	 * @param ticketDate the ticketDate to set
	 */
	public void setTravelDate(Date ticketDate) {
		this.travelDate = ticketDate;
	}

	/**
	 * @return the ticketFee
	 */
	public double getTicketFee() {
		return ticketFee;
	}

	/**
	 * @param ticketFee the ticketFee to set
	 */
	public void setTicketFee(double ticketFee) {
		this.ticketFee = ticketFee;
	}

	@Override
	public String toString() {
		return "Passenger [ticketId=" + ticketId + ", name=" + name + ", destination=" + destination + ", travelDate="
				+ travelDate + ", ticketFee=" + ticketFee + "]";
	}

}

/**
OUTPUT:

Do you want to add the passenger::
YES
Enter the Passenger name::
p1
Enter the travel destination:::
chennai
Enter the travel date in MM/dd/yyyy format::
12/12/2023
Enter the travel time in hh:mm format::
12:00
due date::12/12/2023 12:00
Do you want to add the passenger::
yes
Enter the Passenger name::
p2
Enter the travel destination:::
hyd
Enter the travel date in MM/dd/yyyy format::
11/11/2023
Enter the travel time in hh:mm format::
14:00
due date::11/11/2023 14:00
Do you want to add the passenger::
no
PASSENGER ADDED TO THE QUEUE SUCCESSFULLY::::::PASSENGER QUEUE LIST:::[Passenger [ticketId=0, name=p1, destination=chennai, travelDate=Tue Dec 12 00:00:00 EST 2023, ticketFee=0.0], Passenger [ticketId=0, name=p2, destination=hyd, travelDate=Sat Nov 11 14:00:00 EST 2023, ticketFee=0.0]]
Do you want to board the passenger::
yes
Enter the passenger Name to be boarded::
p1
PASSENGER removed from THE QUEUE SUCCESSFULLY::::
passenger ticket updated::1 ticketfee::210.0
Do you want to board the passenger::
no
PASSENGER BOARDED TO THE QUEUE SUCCESSFULLY::::::PASSENGER BOARDED LIST:::[Passenger [ticketId=1, name=p1, destination=chennai, travelDate=Tue Dec 12 00:00:00 EST 2023, ticketFee=210.0]]
PASSENGER QUEUE LIST:::::::::[Passenger [ticketId=0, name=p2, destination=hyd, travelDate=Sat Nov 11 14:00:00 EST 2023, ticketFee=0.0]]

**/
