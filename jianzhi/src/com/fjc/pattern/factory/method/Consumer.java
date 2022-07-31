package com.fjc.pattern.factory.method;

import com.fjc.pattern.factory.simple.CarFactory;

public class Consumer {
    public static void main(String[] args) {
        Car car = new WulingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        car.name();
        car1.name();
    }
}
