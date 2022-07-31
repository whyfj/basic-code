package lxf.learn;

public class while_t {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n ++;
            sum = sum + n;
        }
        System.out.println(sum);
    }
//    在Java中，while循环是先判断循环条件，再执行循环。而另一种do while循环则是先执行循环，
//    再判断条件，条件满足时继续循环，条件不满足时退出。它的用法是：
//    do {
//        执行循环语句
//    } while (条件表达式);

}
