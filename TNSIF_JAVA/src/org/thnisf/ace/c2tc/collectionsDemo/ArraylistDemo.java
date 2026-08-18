package org.thnisf.ace.c2tc.collectionsDemo;

import java.util.ArrayList;
import java.util.List;


public class ArraylistDemo {

	public static void main(String[] args) {
		List<String> fruits =  new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("Bargon fruit");
		System.out.println(fruits);
		System.out.println("second fruit:"+ fruits.get(1));
		fruits.set(1, "Cherry");
		fruits.remove(2);
		
		if(fruits.contains("Mango"));
		{
			System.out.println(" Mango is in the list");
		}
		for(String fruit:fruits)
		{
			System.out.println(fruits);
		}
		

	}

}
