package com.fjc.pattern.factory.builder;

public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥 具体的工人完成 产品
        Product bulid = director.build(new Worker());
        System.out.println(bulid.toString());
    }
}
