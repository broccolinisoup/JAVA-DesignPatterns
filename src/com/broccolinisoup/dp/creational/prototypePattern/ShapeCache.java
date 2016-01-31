package com.broccolinisoup.dp.creational.prototypePattern;

import java.util.Hashtable;

/*
 * This pattern involves implementing a prototype interface which tells to create 
 * a clone of the current object. This pattern is used when creation of object 
 * directly is costly. For example, an object is to be created after a costly 
 * database operation. We can cache the object, returns its clone on next request 
 * and update the database as and when needed thus reducing database calls.
 * */

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	/* for each shape run database query and create shape
	 * shapeMap.put(shapeKey, shape);
	 * for example, we are adding three shapes */
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		shapeMap.put(square.getId(), square);
	}
	
	public static Shape getShape(String id){
		Shape cachedShape = shapeMap.get(id);
		return (Shape) cachedShape.clone(); 
		/*cachedShape.clone() return Object (type). We provide that the object that 
		 * is retuned will be shape. So we are casting the Object to Shape
		 */
		
	}

}
