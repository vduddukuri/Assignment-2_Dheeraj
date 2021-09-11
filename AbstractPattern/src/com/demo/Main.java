package com.demo;

public class Main {

	public static void main(String[] args) {
		AbstractFactory lawnMowerFactory = FactoryProvider.getFactory();
		LawnMower an = (LawnMower) lawnMowerFactory.create("Left");
		an.getMowerDirection();
	    an.getSpeed();;
	}

}
