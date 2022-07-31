package lxf.learn2;

public class OOP_10 {
    public static void main(String[] args) {
        Inner i = new Inner();
        i.hi();
}
    // private方法:
    private static void hello() {
        System.out.println("private hello!");
    }

    // 静态内部类:
    static class Inner {
        public void hi() {
            OOP_10.hello();
        }
    }
}

