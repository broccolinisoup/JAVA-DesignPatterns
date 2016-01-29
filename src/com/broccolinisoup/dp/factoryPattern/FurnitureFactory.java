package com.broccolinisoup.dp.factoryPattern;

/*
 * FACTORY PATTERN
 * ****************
 * Factory pattern is one of most used design pattern in Java. 
 * This type of design pattern comes under creational pattern 
 * as this pattern provides one of the best ways to create an object.
 * */

public class FurnitureFactory {
	
	public enum TypesOfFurniture {Chair,Couch,Table,}
	
	public Furniture CreateFurniture(TypesOfFurniture type){
		switch (type) {
		case Chair:
			return new Chair();
		case Table:
			return new Table();
		case Couch:
			return new Couch();
		default:
			return null;
		}
		
		
	}

}
