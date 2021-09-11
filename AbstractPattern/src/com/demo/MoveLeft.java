package com.demo;

public class MoveLeft implements LawnMower {

    @Override
    public void getMowerDirection() {
        System.out.println("Direction towards Left");
    }

    @Override
    public void getSpeed() {
        System.out.println("Running at high speed");
    }
}