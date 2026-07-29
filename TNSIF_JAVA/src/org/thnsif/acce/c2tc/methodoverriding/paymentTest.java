package org.thnsif.acce.c2tc.methodoverriding;

class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}
class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment is done using Upi");
	}
}
class cardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using credit card");
	}
	
}
class walletpayment extends Payment
{
	void makePayment()
	{
		System.out.println("payment done by using the wallet payment");
		
	}
}

	


public class paymentTest {

	public static void main(String[] args) {
		Payment payment;
		payment= new UpiPayment();
		payment.makePayment();
		
		payment= new cardPayment();
		payment.makePayment();
		
		payment= new  walletpayment();
		payment.makePayment(); 
		
		
		
		// TODO Auto-generated method stub

	}

}
