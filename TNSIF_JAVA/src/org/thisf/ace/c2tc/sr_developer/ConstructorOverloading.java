package org.thisf.ace.c2tc.sr_developer;
class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name :"+name);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name :"+ name +"Age :"+age);	 
	}	
}


public class ConstructorOverloading 

{

	public static void main(String[] args) {
		Student obj = new Student();
	
		Student obj1=new Student("Chandini");
		Student obj2= new Student("chandini ",20);
		
		// TODO Auto-generated method stub

	}

}
