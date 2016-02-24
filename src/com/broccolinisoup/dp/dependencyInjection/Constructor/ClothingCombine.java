package com.broccolinisoup.dp.dependencyInjection.Constructor;

import com.broccolinisoup.dp.dependencyInjection.Constructor.Dress;
import com.broccolinisoup.dp.dependencyInjection.Constructor.Shoes;

public class ClothingCombine {
	private Dress dress;
	private Shoes shoes;
	
	//we pass the object reference in the constructor itself. This is place where the dependencies injected!
	public ClothingCombine(Dress injectedDress, Shoes injectedShoes) {
		this.dress = injectedDress;
		this.shoes = injectedShoes;
	}
	
	public void showMyCombine(){
		System.out.println("I am wearing today for dress " + dress.getType()+ " and for shoes " + shoes.getType());
	}

}
