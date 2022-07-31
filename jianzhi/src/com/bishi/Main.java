package com.bishi;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s == null || s.length()<=1){
            System.out.println(s);
        }
        LinkedList<Character> chars = new LinkedList<Character>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++){
            chars.add(ch[i]);
        }

        dfs(chars);

        StringBuffer stringBuffer = new StringBuffer();
        for (Character a : chars){
            stringBuffer.append(a);
        }
        System.out.println(stringBuffer);
    }

    public static void dfs(LinkedList<Character> chars){
        int i = 0;
        while (i<chars.size()-2){
            if (chars.get(i) == chars.get(i+1)){
                i +=1;
                continue;
            }
            if (chars.get(i).equals('b') && chars.get(i+1).equals('a')){
                i +=1;
                continue;
            }
            if (chars.get(i).equals('a') && chars.get(i+1).equals('b') && chars.get(i+2).equals('b')){
                chars.remove(i+1);
            }else {
                chars.remove(i);
            }
        }
        if (chars.get(chars.size()-2).equals('a') && chars.get(chars.size()-1).equals('b')){
            chars.remove(i+1);
        }
    }
}