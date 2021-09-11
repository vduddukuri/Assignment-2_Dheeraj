package com.demo;

public class LawnMowerFactory implements AbstractFactory<LawnMower> {

    @Override
    public LawnMower create(String animalType) {
    	if ("Left".equalsIgnoreCase(animalType)) {
            return new MoveLeft();
        } else {
        	System.out.println("Direction towards Right");
        }

        return null;
    }

}
