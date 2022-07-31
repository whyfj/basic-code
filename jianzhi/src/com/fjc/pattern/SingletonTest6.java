package com.fjc.pattern;

public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance1 = Singleton6.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

}

//饿汉式（静态变量）
class Singleton6 {
    private static volatile Singleton6 instance;
    private Singleton6() {}
    public static Singleton6 getInstance() {
        if(instance == null) {
            synchronized (Singleton6.class){
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}