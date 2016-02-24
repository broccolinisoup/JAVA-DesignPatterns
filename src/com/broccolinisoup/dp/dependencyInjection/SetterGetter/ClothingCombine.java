package com.broccolinisoup.dp.dependencyInjection.SetterGetter;

public class ClothingCombine {
	private Dress dress;
	private Shoes shoes;

	public Dress getDress() {
		return dress;
	}

	//we pass the object reference in the setter method of the main class. This is place where the dependencies injected!
	public void setDress(Dress dress) {
		this.dress = dress;
	}

	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}

	public void showMyCombine() {

		System.out.println("I am wearing today for dress " + dress.getType()
				+ " and for shoes " + shoes.getType());
	}

}
