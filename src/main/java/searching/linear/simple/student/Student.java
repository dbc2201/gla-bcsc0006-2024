package searching.linear.simple.student;

public class Student {
	private int rollNumber;
	private String name;
	
	public Student() {
		this.rollNumber = 4;
		this.name = "DBC";
	}
	
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

