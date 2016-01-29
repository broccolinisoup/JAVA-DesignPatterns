package com.broccolinisoup.dp.abstractFactoryPattern;

public class FactoryProducer {
	
	public AbstractFactory getFactory(String choice){
		
		if (choice.equalsIgnoreCase("SHAPE")) {
			
			return new ShapeFactory();
			
		}
		
		else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
			
		}
		
		else {
			return null;

		}
		
		
	}

}
