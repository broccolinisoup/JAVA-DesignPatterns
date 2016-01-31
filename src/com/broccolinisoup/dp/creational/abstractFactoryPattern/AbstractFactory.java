package com.broccolinisoup.dp.creational.abstractFactoryPattern;

//Create an Abstract class to get factories for Color and Shape Objects.

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String color);

}
