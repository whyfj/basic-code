package lxf.learn2;

public class ClassT {
    public static void main(String[] args) {
        Class cls1 = String.class;

        String s = "Hello";
        Class cls2 = s.getClass();

        boolean sameClass = cls1 == cls2; // true
    }
}
