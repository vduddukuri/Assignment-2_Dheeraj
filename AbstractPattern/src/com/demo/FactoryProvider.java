package com.demo;

public class FactoryProvider {
    public static AbstractFactory getFactory(){
        
    return new LawnMowerFactory();

    }
}