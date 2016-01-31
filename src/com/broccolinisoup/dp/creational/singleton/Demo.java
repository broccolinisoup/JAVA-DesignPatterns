package com.broccolinisoup.dp.creational.singleton;

public class Demo {
	
	public static void main(String[] args) {
		SingleObject obj = SingleObject.getInstance();
		
		obj.message();
	}

}
