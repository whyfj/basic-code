package lxf.coreclass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
//        String s1 = "Hello!";
//        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        从表面上看，两个字符串用==和equals()比较都为true，但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。
        // 是否包含子串:
        "Hello".contains("ll"); // true
        String s = "A,B,C,D";
        String[] ss = s.split(","); // {"A", "B", "C", "D"}
        System.out.println(Arrays.toString(ss));
        int n2 = Integer.parseInt("12", 4);
        int n3 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        System.out.println(n2);
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        System.out.println(b2);
    }
}

class Main {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores.clone();
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}

class Main2 {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());

    }
}
