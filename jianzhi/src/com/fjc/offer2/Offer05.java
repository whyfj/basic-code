package com.fjc.offer2;

public class Offer05 {
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        Offer05 test5 = new Offer05();
        System.out.println(test5.replaceSpace(s));
    }
}