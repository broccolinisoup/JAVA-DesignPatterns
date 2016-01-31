package com.broccolinisoup.dp.creational.factoryPattern;

import com.broccolinisoup.dp.creational.factoryPattern.FurnitureFactory.TypesOfFurniture;

public class Demo {

	public static void main(String[] args) {
		FurnitureFactory factory = new FurnitureFactory();
		
		Furniture chair = factory.CreateFurniture(TypesOfFurniture.Chair);
		System.out.println("Factory created a production : "+ chair.writeType());
		
		Furniture table = factory.CreateFurniture(TypesOfFurniture.Table);
		System.out.println("Factory created a production : "+ table.writeType());
		
		Furniture couch = factory.CreateFurniture(TypesOfFurniture.Couch);
		System.out.println("Factory created a production : "+ couch.writeType());
		
		

	}

}
