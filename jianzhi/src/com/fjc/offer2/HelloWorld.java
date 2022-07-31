package com.fjc.offer2;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        System.out.print("");
        System.out.println("");
        int a = 5;
        System.out.println(a);
        LinkedList link = new LinkedList<>();
        int[] ns = new int[] { 68, 79, 91, 85, 62 };
        for (Object s : ns){
            System.out.println(s);
        }
        //List<Integer> list = invertUsingCollectionsReverse(ns);
        //for (Integer s : list) {
        //    System.out.println(s);
        //}


    }


    public static List invertUsingCollectionsReverse(int[] array) {
        List list = List.of(array);
        Collections.reverse(list);
        return list;
    }
}
