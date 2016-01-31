package com.broccolinisoup.dp.creational.builderPattern;

public class FourCheesePizza extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Cross");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Tomato and garlic ");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Mozarella, ricotta, fetta, parmesan");

	}

}
