package lxf.learn;

import java.util.Scanner;

public class Scanner_t {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 观察x和y是否相等:
        System.out.println(x);
        System.out.println(y);

        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出

    }
}
//    next() 与 nextLine() 区别
//        next():
//
//        1、一定要读取到有效字符后才可以结束输入。
//        2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
//        3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
//        next() 不能得到带有空格的字符串。
//        nextLine()：
//
//        1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
//        2、可以获得空白。