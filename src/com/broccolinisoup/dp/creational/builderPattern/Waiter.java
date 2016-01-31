package com.broccolinisoup.dp.creational.builderPattern;

public class Waiter {
	
	public Waiter(){}
	
	private PizzaBuilder pizzaBuilder;

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void buildPizza(PizzaBuilder pizzaBuilder){
		pizzaBuilder.createNewPizza();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
		
		
		
	}

}
