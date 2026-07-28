package org.thisf.ace.c2tc.jr_developer;

class Device
{
	void devicetype()
	{
		System.out.println("I am an electronic device");
	}
}
class phone extends Device
{
	void brand()
	{
		System.out.println("brand.vivo");
	}
	
}
class smartphones extends phone
{
	void features()
	{
		System.out.println("featurs.touchscreen,internet");
	}
}

public class mulitlevelinheritance {

	public static void main(String[] args) {
		smartphones sp =new smartphones();
		sp.devicetype();
		sp.brand();
		sp.features();
		
		// TODO Auto-generated method stub

	}

}
