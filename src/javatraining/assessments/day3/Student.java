package javatraining.assessments.day3;

/**
 * Assignment: Inheritance and Polymorphism
 * @author ramya
 *
 */
public class Student {

	private int studentId;
	private String name;
	private int age;
	
	
	
	public Student(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}


	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Student objStudent = new Student(11,"ram",21);
		System.out.println("student details::"+objStudent);
		
		objStudent.setStudentId(21);
		objStudent.setName("ramnew");
		objStudent.setAge(22);
		System.out.println("updated:::student id::"+objStudent.getStudentId()+" student name::"+objStudent.getName()
				+" student age::"+objStudent.getAge());
		
		
	}

	
	
}
