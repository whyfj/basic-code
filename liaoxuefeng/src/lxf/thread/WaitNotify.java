package lxf.thread;

import java.util.*;
public class WaitNotify {
    public static void main(String[] args)  throws InterruptedException {
        var q = new TaskQueue1();
        var ts =new ArrayList<Thread>();
        for (int i=0; i<5; i++){
            var t = new Thread(){
                @Override
                public void run() {
                    while (true){
                        String s = q.getTask();
                        System.out.println("execute task: " + this.getName() + s);
                    }
                }
            };
            t.start();
            ts.add(t);
        }
        var add = new Thread(() -> {
            for (int i=0; i<10; i++) {
                // 放入task:
                String s = "t-" + i;
                System.out.println("add task: " + s);
                q.addTask(s);
                try { Thread.sleep(100); } catch(InterruptedException e) {}
            }
        });
        add.start();
        add.join();  // 这里start,join可能抛出的异常没有catch，所以main需要抛出异常。
        Thread.sleep(100);
        for (var t : ts) {
            t.interrupt();
        }
    }
}

class TaskQueue{
    Queue<String> queue = new LinkedList<>();
    public synchronized void addTask(String s){
        queue.add(s);
        this.notifyAll();
    }
    public synchronized String getTask() throws InterruptedException {
        while (queue.isEmpty()) {
            this.wait();
        }
        return queue.remove();
    }
}