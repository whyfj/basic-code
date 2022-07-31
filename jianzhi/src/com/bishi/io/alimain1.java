package com.bishi.io;

import java.util.Scanner;

public class alimain1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int b = scan.nextInt();
        String st = scan.next();
        int x = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        String[] str = s.split(" ");
        System.out.println(st);
        System.out.println(str[0]);
    }
}

//class Main_04{
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNextInt()) {
//            int number = scan.nextInt();
//            if(number == 0) break;
//            int sum = 0;
//            for(int i = 1; i <= number; ++i) {
//                sum += scan.nextInt();
//            }
//            System.out.println(sum);
//        }
//    }
//}