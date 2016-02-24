package com.broccolinisoup.dp.dependencyInjection.FirstVersion;

/*
 * Before we get in what IOC and DIP, let's try to understand what the problem is.
 * The Problem –> Tight Coupling
 * 
 * We have a ClothingCobine class which contains a Dress class object and Shoes class object. 
 * The biggest problem is that ClothingCobine have a tight coupling relationship between classes.
 * In other words the ClothingCombine class depends on the Dress and Shoes objects. 
 * 
 * If Dress or Shoes classes change it will lead to change and compiling of 
 * ‘ClothingCombine’ class as well. 
 * 
 * ClothingCobine class knows everything about Dress and Shoes classes. It has a big control!
 * ClothingCobine controls the creation of Dress and Shoes object! What is that!!!
 * Of course ClothingCobine, Dress and Shoes Classes should be aware of each other because they are working together 
 * but should not know all the details. They need privacy!
 * */

public class ClothingCombine {
	private Dress dress;
	private Shoes shoes;
	
	public ClothingCombine(String dressType, String shoesType){
		this.dress = new Dress(dressType);
		this.shoes = new Shoes(shoesType);
	}
	
	public void showMyCombine(){
		
		System.out.println("I am wearing today for dress " + dress.getType()+ " and for shoes " + shoes.getType());
	}
	
	/*
	 * So what should we do?
	 * We will invert this control. Inversion of Control (IOC)
	 * Wee need to shift the object creating from ClothingCobine class to some one else.
	 * 
	 * */

}
