package com.broccolinisoup.dp.dependencyInjection.SetterGetter;

public class GoingOut {
	
	public static void main(String[] args) {
		ClothingCombine myCombine = new ClothingCombine();
		Dress myDress = new Dress("straplez");
		myCombine.setDress(myDress);
		Shoes myShoes = new Shoes("Stiletto");
		myCombine.setShoes(myShoes);
	
		myCombine.showMyCombine();
	}

}
