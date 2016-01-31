package com.broccolinisoup.dp.creational.abstractFactoryPattern;

public class Demo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
		ColorFactory colorFactory = new ColorFactory();
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		Shape square = shapeFactory.getShape("SQUARE");
		
		circle.draw();
		rectangle.draw();
		square.draw();
		
		Color red = colorFactory.getColor("RED");
		Color blue = colorFactory.getColor("BLUE");
		Color green = colorFactory.getColor("GREEN");
		
		red.fill();
		blue.fill();
		green.fill();
		
		
		

	}

}
