package com.fjc.pattern;

public class SingletonTest1 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

//饿汉式（静态变量）
class Singleton1{
    private Singleton1() {

    }
    private final static Singleton1 instance = new Singleton1();
    public static Singleton1 getInstance() {
        return instance;
    }
}