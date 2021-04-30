package Entities;

public class Instructor extends User {
	private String course;
	private double salary;
	private String ability;
	
	public Instructor() {
		
	}
	
	public Instructor(String course, double salary, String ability) {
		super();
		this.course = course;
		this.salary = salary;
		this.ability = ability;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}
	
}
