package com.fjc.pattern.adapter;

public class Computer {
    public void net(NetToUsb adapter){
    //上网的具体实现
        adapter.handleRequest();
    }

    public static void main(String[] args) {
    //电脑,适配器，网线
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        computer.net(adapter);
    }
}
