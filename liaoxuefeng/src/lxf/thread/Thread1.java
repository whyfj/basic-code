package lxf.thread;

public class Thread1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start");
    }
}

/*
public class Thread1 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start(); // 启动新线程
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start new thread!");
    }
}
*/

//public class Thread1 {
//    public static void main(String[] args) {
//        Thread t = new Thread(() -> {
//            System.out.println("start new thread!");
//        });
//        t.start(); // 启动新线程
//    }
//}

/*public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested");
        outer.asyncHello();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    void asyncHello() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}*/
