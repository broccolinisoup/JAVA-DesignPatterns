package com.broccolinisoup.dp.abstractFactoryPattern;

//Create an Abstract class to get factories for Color and Shape Objects.

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String color);

}
