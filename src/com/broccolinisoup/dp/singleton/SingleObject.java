package com.broccolinisoup.dp.singleton;

/*
 * SINGLETON DESIGN PATTERN
 * 
 * Ensure a class has only one instance, and provide a global point of access to it. (GOF)
 * */

public class SingleObject {
	
	//create an object of SingleObject
	private static SingleObject instance = null;
	
	///make the constructor private so that this class cannot be instantiated
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		if (instance == null){
			instance=  new SingleObject();
		}
		return instance;
	}
	
	public void message(){
		System.out.println("Hello Dear!");
	}
}
