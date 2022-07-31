package com.bishi;

public class TraversalString {
    public static void main(String[] args) {
        String str = "keep walking!!!";
        //方法一
        char[] charArray = str.toCharArray();
        for (char i : charArray){
            System.out.println(i);
        }
        //方法二
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        //方法三
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.substring(i, i + 1));
        }
    }
}
