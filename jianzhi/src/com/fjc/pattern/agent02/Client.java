package com.fjc.pattern.agent02;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler pil = new ProxyInvocationHandler();
        pil.setRent(host);
        Rent proxy = (Rent) pil.getProxy(); //这里的proxy就是动态生成的，并没有写
        proxy.rent();
    }
}
