package com.bishi.io;

import java.util.*;
import java.util.Scanner;


//nextLine()会把nextInt()，next()，nextDouble()，nextFloat()的结束换行符作为字符串读入，进而不需要从键盘输入字符串nextLine便已经转向了下一条语句执行。
//
//解决方法：
//
//在每一个nextInt()，next()，nextDouble()，nextFloat()后都加一个nextLine()语句，将被next()去掉的Enter过滤掉
//————————————————

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[3]);
    }
}



//输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据包括多组。
//输入
//1 5
//10 20
//输出
//6
//30
class Main_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}


//输入第一行包括一个数据组数t(1 <= t <= 100)
//接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)
class Main_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
            t--;
        }
        sc.close();
    }
}



//输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据有多组, 如果输入为0 0则结束输入
class Main_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0) break;
            System.out.println(a+b);
        }
    }
}


//输入数据包括多组。
//每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
//接下来n个正整数,即需要求和的每个正整数。
//4 1 2 3 4
//5 1 2 3 4 5
//0
//输出
//10
//15
class Main_04{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {
            int number = scan.nextInt();
            if(number == 0) break;
            int sum = 0;
            for(int i = 1; i <= number; ++i) {
                sum += scan.nextInt();
            }
            System.out.println(sum);
        }
    }
}

class Main_05{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}



//输入数据有多组, 每行表示一组输入数据。
//每行不定有n个整数，空格隔开。(1 <= n <= 100)。
//输出每组数据输出求和的结果
class Main_07{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int res=0;
            for(String n:str){
                res+=Integer.parseInt(n);
            }
            System.out.println(res);
        }
    }
}

class Main_071{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int sum = 0;
            for(int i =0;i<str.length;i++){
                sum +=Integer.valueOf(str[i]);
            }
            System.out.println(sum);
        }
    }
}


class Main_08{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> str = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            str.add(sc.next());
        }
        Collections.sort(str);
        for(String s : str){
            System.out.print(s + " ");
        }
    }
}

class Main_081{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n;i++){
            str[i] = sc.next();
        }
        Arrays.sort(str);
        for(int i = 0;i < n-1;i++){
            System.out.print(str[i] + " ");
        }
        System.out.print(str[n-1]);
    }
}

class Main8_{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        String[] s = sc.nextLine().split(" ");
        Arrays.sort(s);
        String join = String.join(" ", s);
        System.out.print(String.join(" ",s));
    }
}

//a c bb
//f dddd
//nowcoder
//a bb c
//dddd f
//nowcoder
class Main_09{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split(" ");
            Arrays.sort(str);
            for(String s : str){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}

class Main_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split(",");
            List<String> strList = Arrays.asList(str);
            Collections.sort(strList);

            System.out.println(String.join(",",strList));
        }
    }
}

//a,c,bb
//f,dddd
//nowcoder
class Main10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String[] str = sc.nextLine().split(",");
            Arrays.sort(str);

            System.out.println(String.join(",",str));
        }
    }
}

//输入
//4
//6 89 0 6
class Main11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int target = sc.nextInt();
            sc.nextLine(); //接收换行符/n
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int[] ints = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                ints[i] = Integer.valueOf(str[i]);
            }
        }
    }
}

//正则表达式分割
class Main_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "\\[|\\]|:|：";
        String[] a = sc.nextLine().split(re);
        for (String i :a ){
            System.out.println(i);
        }
    }
}