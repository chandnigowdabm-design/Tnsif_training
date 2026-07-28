package org.thisf.ace.c2tc.jr_developer;

class Employee
{
	void company()
	{
		System.out.println("Company : TNSIF");
	}
}
class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : software Developer");
	}
}
class Tester extends Developer
{
	void role()
	{
		System.out.println("Role : QA Tester");
	}
		
}
	


public class Hierarichalinheritance {

	public static void main(String[] args) {
		Developer dp= new Developer();
		dp.company();
		dp.role();
		Tester ts=new Tester();
		ts.role();
		ts.company();
		
		
		
		// TODO Auto-generated method stub

	}

}
