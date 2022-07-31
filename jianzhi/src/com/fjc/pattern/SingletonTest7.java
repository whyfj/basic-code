package com.fjc.pattern;

public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance1 = Singleton7.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

//饿汉式（静态变量）
class Singleton7 {
    private Singleton7() {}
    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}