package com.fjc.pattern;


//推荐使用1,2饿汉式，和6,7,8：双重检查，静态内部类，枚举
public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton8 instance = Singleton8.INSTANCE;
        Singleton8 instance1 = Singleton8.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

enum Singleton8 {
    INSTANCE;
    public void sayOK(){
        System.out.println("hello");
    }
}