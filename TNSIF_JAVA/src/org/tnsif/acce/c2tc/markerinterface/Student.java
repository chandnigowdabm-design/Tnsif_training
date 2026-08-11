package org.tnsif.acce.c2tc.markerinterface;

public class Student implements Registerable
{
	private int id;
	private String name;
	private String course;
	private double fees;
	
	Student(int id, String name, double fees, String course)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
		this.course=course;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
