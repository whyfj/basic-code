package lxf.learn2;

public class InnerClass11 {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested"); // 实例化一个Outer
        Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}
// https://www.runoob.com/java/java-anonymous-class.html

class Polygon {
    public void display() {
        System.out.println("在 Polygon 类内部");
    }
}

class AnonymousDemo {
    public void createClass() {

        // 创建的匿名类继承了 Polygon 类
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

/*
interface Polygon {
    public void display();
}

class AnonymousDemo {
    public void createClass() {

        // 匿名类实现一个接口
        Polygon p1 = new Polygon() {
            public void display() {
                System.out.println("在匿名类内部。");
            }
        };
        p1.display();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }*/
