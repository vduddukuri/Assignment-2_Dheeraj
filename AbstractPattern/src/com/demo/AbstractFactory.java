package com.demo;

public interface AbstractFactory<T> {
    T create(String mowerDirection) ;
}
