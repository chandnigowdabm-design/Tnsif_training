package org.thnsif.acce.c2tc.methodoverriding;

class Notification
{
	String message="Default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification";
	
	void showNotification()
	{
		System.out.println("Child message:"+message);
		System.out.println("Parent message:"+super.message);
		
	}
	
}

public class SuperwithVariable {

	public static void main(String[] args) {
		PushNotification obj=new  PushNotification();
		 obj.showNotification();
		// TODO Auto-generated method stub

	}

}
