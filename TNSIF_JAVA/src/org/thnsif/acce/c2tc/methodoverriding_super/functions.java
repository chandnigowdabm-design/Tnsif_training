package org.thnsif.acce.c2tc.methodoverriding_super;
class addtion
{
	int add(int a, int b)
	{
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	double add(double a, double b, double c)
	{
		return a+b+c;
	}
	
	public class functions{
	public static void main(String[] args) {
		addtion obj=new addtion();
		System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5f, 20.5f));
        System.out.println(obj.add(10, 20, 30));
	}
		
		// TODO Auto-generated method stub

	}

}
