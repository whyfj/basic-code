package lxf.expression.regular;

public class Regular3 {
    public static void main(String[] args) {
        String re = "learn\\s(java|php|go)(a)";
        System.out.println("learn javaa".matches(re));
        System.out.println("learn Java".matches(re));
        System.out.println("learn php".matches(re));
        System.out.println("learn Go".matches(re));
    }
}

//要匹配大小写不限的十六进制数，比如1A2b3c，我们可以这样写：[0-9a-fA-F]，它表示一共可以匹配以下任意范围的字符：
//
//        0-9：字符0~9；
//        a-f：字符a~f；
//        A-F：字符A~F。