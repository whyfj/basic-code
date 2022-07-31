package com.fjc.pattern;

public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);
    }

}

//饿汉式（静态代码块）
class Singleton2{
    private Singleton2() {

    }
    private static Singleton2 instance;
    static {
        instance = new Singleton2();
    }
    public static Singleton2 getInstance() {
        return instance;
    }
}