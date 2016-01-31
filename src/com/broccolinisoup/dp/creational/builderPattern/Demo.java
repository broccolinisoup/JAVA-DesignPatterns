package com.broccolinisoup.dp.creational.builderPattern;

// Customer orders a pizza
public class Demo {
	
	public static void main(String[] args) {
		
		Waiter waiter = new Waiter();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		PizzaBuilder fourcheesePizzaBuilder = new FourCheesePizza();
		
		waiter.setPizzaBuilder( spicyPizzaBuilder );
	    waiter.buildPizza(spicyPizzaBuilder);
	    
	    Pizza pizza = waiter.getPizza();
	    
	    System.out.println("Pizza dough: " + pizza.getDough() + " "
	    		+ "Pizza Sauce: " + pizza.getSauce() + " "
	    		+ "Pizza Topping: " + pizza.getTopping());
	    
	    
		
	}
	
	

	
	

}
