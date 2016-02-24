package com.broccolinisoup.dp.dependencyInjection.Constructor;


public class GoingOut {
	
	public static void main(String[] args) {
		Dress myDress = new Dress("Straplez");
		Shoes shoes = new Shoes("Stiletto");
		ClothingCombine myCombine = new ClothingCombine(myDress, shoes);
	
		myCombine.showMyCombine();
	}

}
