package javatraining.assessments.day6;

/**
 * final Employee Data
Develop an Employee class with final fields for employee details such as name, employee ID, and department. 
Implement methods to display employee information and demonstrate their usage
 * @author ramya
 *
 */
final class Employee {

	private final String name;
	private final int employeeId;
	private final String deptName;
	private final double salary;
	
	
	/**
	 * @param name
	 * @param employeeId
	 * @param deptName
	 */
	public Employee(String name, int employeeId, String deptName, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	
	public void displayEmpInfo() {
		System.out.println("Employee name::"+getName()+" Employee Id:::"+getEmployeeId()+" Dept Name::"+getDeptName()+" salary:::"+getSalary());
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("ram", 2342, "DEV",20000);
		emp.displayEmpInfo();
		Employee emp1 = new Employee("sdfa", 2334, "DB",40000);
		emp1.displayEmpInfo();
		// compilation error : final field cannot be assigned
		// reason: final field values are the constants initialized using the constructor which cannot be modified later and no setter methods would be available for the final fields
		//emp.salary = 50000; 
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
}
