package org.tnsif.acce.c2tc.markerinterface;

public class markerinterfacedemo {

	public static void main(String[] args) {
		Registerable s = new Student( 12, "sushma",20000,"Java programming");
		Registerable s1 = new Student( 12, "anil",30000,"Java programming");
		
		Object obj= new Object(); 
		if( obj instanceof Registerable)
		{
			System.out.println("Student is registered for this course");
		}
		else
		{
			System.out.println("Student is not registered for this course");
			
		}
		
	}

}
