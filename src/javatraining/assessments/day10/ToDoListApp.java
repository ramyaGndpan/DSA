package javatraining.assessments.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Assignment 1: Implement a To-Do List Application Create a To-Do List
 * application where users can add, remove, and mark tasks as completed. Use a
 * LinkedList to store the tasks and implement methods to perform these
 * operations. You can also add features like sorting tasks based on priority or
 * due date.
 * 
 * @author ramya
 *
 */
public class ToDoListApp {

	public static LinkedList<Task> todoList = new LinkedList<Task>();
	public static Scanner in = new Scanner(System.in);
	private static String strTaskName = "", strTaskDesc = "", strTaskDueDate = "", strTaskDueTime = "";
	private static int taskId = 0;

	/**
	 * addTask
	 */
	public static void addTask() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			System.out.println("Do you want to create the task::");
			boolean flagTask = (in.next().equalsIgnoreCase("yes") ? true : false);
			if(flagTask) {
				while (flagTask) {
					System.out.println("Enter the task name::");
					strTaskName = in.next();
					System.out.println("Enter task description:::");
					strTaskDesc = in.next();
					System.out.println("Enter the task due date in MM/dd/yyyy format::");
					strTaskDueDate = in.next();
					System.out.println("Enter the task due time in hh:mm format::");
					strTaskDueTime = in.next();
					strTaskDueDate = strTaskDueDate + " " + strTaskDueTime;
					Task task = null;
					System.out.println("due date::" + strTaskDueDate + " parsed due date::" + sdf.parse(strTaskDueDate));
					task = new Task(++taskId, strTaskName, strTaskDesc, "open", Calendar.getInstance().getTime(),
							sdf.parse(strTaskDueDate));
					todoList.add(task);
					System.out.println("Do you want to create the task::");
					flagTask = (in.next().equalsIgnoreCase("yes") ? true : false);
				}
				System.out.println("TASK ADDED SUCCESSFULLY::::::TASK LIST:::" + todoList.toString());
			}else {
				throw new InputMismatchException("Please enter valid input::TASK NOT CREATED SUCCESSFULLY:::");
			}
		} catch (ParseException e) {
			System.out.println("Parsing exception:::Please enter the due date in valid date format:::TASK NOT CREATED SUCCESSFULLY...");
			e.printStackTrace();
		} catch (InputMismatchException iex) {
			System.out.println("InputMismatchException:::Please enter valid input::::TASK NOT CREATED SUCCESSFULLY:::");
			iex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception occured::::TASK NOT CREATED SUCCESSFULLY.:");
			ex.printStackTrace();
		}
	}

	/**
	 * removeTask
	 */
	public static void removeTask() {
		System.out.println("removeTask process STARTED::");
		System.out.println("Please enter the taskId to remove::");
		int taskId = in.nextInt();
		for (Task task : todoList) {
			if (task.getTaskId() == taskId)
				todoList.remove(task);
		}
		System.out.println("TASK REMOVED SUCCESSFULLY::UPDATED TASK LIST::::::" + todoList.toString());
	}

	public static void setTaskStatus() {
		System.out.println("setTaskStatus process STARTED::");
		System.out.println("Please enter the taskId::");
		int taskId = in.nextInt();
		System.out.println("Please enter the task status to update::");
		String strTaskStatus = in.next();
		for (int index = 0; index < todoList.size(); index++) {
			Task task = (Task) todoList.get(index);
			if (task.getTaskId() == taskId) {
				task.setTaskStatus(strTaskStatus);
				todoList.set(index, task);
				break;
			}
		}
		System.out.println("TASK STATUS UPDATED SUCCESSFULLY::UPDATED TASK LIST::::::" + todoList.toString());
	}

	public static void getAllTasks() {
		System.out.println("getAllTasks: TASK LIST::::::" + todoList.toString());
	}

	public static List<Task> sortTasks() {
		System.out.println("sortTasks process STARTED::");
		Comparator<Task> PriorityComparator = new Comparator<Task>() {
			public int compare(Task obj1, Task obj2) {
				if (obj1.getTaskDueDate().after(obj2.getTaskDueDate()))
					return -1;
				return 1;
			}
		};
		todoList.sort(PriorityComparator);
		System.out.println("sortTasks: TASK LIST SORTED SUCCESSFULLY::::::" + todoList.toString());
		return todoList;
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ToDoListApp.addTask();
		ToDoListApp.setTaskStatus();
		ToDoListApp.sortTasks();
		ToDoListApp.getAllTasks();
		ToDoListApp.removeTask();
	}

}

class Task {
	private String taskName;
	private String taskDesc;
	private String taskStatus;
	private Date taskCreatedDate;
	private Date taskDueDate;
	private int taskId;

	/**
	 * @param taskName
	 * @param taskDesc
	 * @param taskStatus
	 * @param taskCreatedDate
	 * @param taskDueDate
	 */
	public Task(int taskId, String taskName, String taskDesc, String taskStatus, Date taskCreatedDate,
			Date taskDueDate) {
		super();
		// this.taskId = (int)(Math.random()*20);
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
		this.taskStatus = taskStatus;
		this.taskCreatedDate = taskCreatedDate;
		this.taskDueDate = taskDueDate;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskDesc
	 */
	public String getTaskDesc() {
		return taskDesc;
	}

	/**
	 * @param taskDesc the taskDesc to set
	 */
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	/**
	 * @return the taskStatus
	 */
	public String getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	/**
	 * @return the taskCreatedDate
	 */
	public Date getTaskCreatedDate() {
		return taskCreatedDate;
	}

	/**
	 * @param taskCreatedDate the taskCreatedDate to set
	 */
	public void setTaskCreatedDate(Date taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}

	/**
	 * @return the taskDueDate
	 */
	public Date getTaskDueDate() {
		return taskDueDate;
	}

	/**
	 * @param taskDueDate the taskDueDate to set
	 */
	public void setTaskDueDate(Date taskDueDate) {
		this.taskDueDate = taskDueDate;
	}

	/**
	 * @return the taskId
	 */
	public int getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", taskDesc=" + taskDesc + ", taskStatus=" + taskStatus
				+ ", taskCreatedDate=" + taskCreatedDate + ", taskDueDate=" + taskDueDate + ", taskId=" + taskId + "]";
	}

}


/**
OUTPUT:

Do you want to create the task::
YES
Enter the task name::
TASK1
Enter task description:::
SHOPPING
Enter the task due date in MM/dd/yyyy format::
12/12/2023
Enter the task due time in hh:mm format::
12:00
due date::12/12/2023 12:00 parsed due date::Tue Dec 12 00:00:00 EST 2023
Do you want to create the task::
YES
Enter the task name::
TASK2
Enter task description:::
MEETING
Enter the task due date in MM/dd/yyyy format::
12/1/2023
Enter the task due time in hh:mm format::
16:00
due date::12/1/2023 16:00 parsed due date::Fri Dec 01 16:00:00 EST 2023
Do you want to create the task::
NO
TASK ADDED SUCCESSFULLY::::::TASK LIST:::[Task [taskName=TASK1, taskDesc=SHOPPING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:31 EDT 2023, taskDueDate=Tue Dec 12 00:00:00 EST 2023, taskId=1], Task [taskName=TASK2, taskDesc=MEETING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:55 EDT 2023, taskDueDate=Fri Dec 01 16:00:00 EST 2023, taskId=2]]
setTaskStatus process STARTED::
Please enter the taskId::
1
Please enter the task status to update::
INPROGRESS
TASK STATUS UPDATED SUCCESSFULLY::UPDATED TASK LIST::::::[Task [taskName=TASK1, taskDesc=SHOPPING, taskStatus=INPROGRESS, taskCreatedDate=Tue Aug 29 15:16:31 EDT 2023, taskDueDate=Tue Dec 12 00:00:00 EST 2023, taskId=1], Task [taskName=TASK2, taskDesc=MEETING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:55 EDT 2023, taskDueDate=Fri Dec 01 16:00:00 EST 2023, taskId=2]]
sortTasks process STARTED::
sortTasks: TASK LIST SORTED SUCCESSFULLY::::::[Task [taskName=TASK1, taskDesc=SHOPPING, taskStatus=INPROGRESS, taskCreatedDate=Tue Aug 29 15:16:31 EDT 2023, taskDueDate=Tue Dec 12 00:00:00 EST 2023, taskId=1], Task [taskName=TASK2, taskDesc=MEETING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:55 EDT 2023, taskDueDate=Fri Dec 01 16:00:00 EST 2023, taskId=2]]
getAllTasks: TASK LIST::::::[Task [taskName=TASK1, taskDesc=SHOPPING, taskStatus=INPROGRESS, taskCreatedDate=Tue Aug 29 15:16:31 EDT 2023, taskDueDate=Tue Dec 12 00:00:00 EST 2023, taskId=1], Task [taskName=TASK2, taskDesc=MEETING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:55 EDT 2023, taskDueDate=Fri Dec 01 16:00:00 EST 2023, taskId=2]]
removeTask process STARTED::
Please enter the taskId to remove::
1
TASK REMOVED SUCCESSFULLY::UPDATED TASK LIST::::::[Task [taskName=TASK2, taskDesc=MEETING, taskStatus=open, taskCreatedDate=Tue Aug 29 15:16:55 EDT 2023, taskDueDate=Fri Dec 01 16:00:00 EST 2023, taskId=2]]

**/

