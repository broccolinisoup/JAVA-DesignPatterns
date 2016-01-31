package com.broccolinisoup.dp.creational.builderPattern;

public class SpicyPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		pizza.setDough("Pan baked");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Hot Garlic Cheese");

	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni + mushroom + bean ");

	}

}
