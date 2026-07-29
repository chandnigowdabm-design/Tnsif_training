package org.thnsif.acce.c2tc.methodoverriding_super;

class payment1
{
	void process()
	{
		System.out.println("Processing payment using Standard gateway");
	}
}

class Gpay extends payment1
{
	void process()
	{
		System.out.println("Processsing payment via Google pay");
	}
	
	void CompleteTransaction()
	{
		super.process();
		process();
	}
}


public class SuperwithMethod {

	public static void main(String[] args) {
		Gpay obj=new Gpay();
		obj.CompleteTransaction();

		// TODO Auto-generated method stub

	}

}
