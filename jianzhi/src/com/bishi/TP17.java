package com.bishi;

import java.util.HashSet;
import java.util.Set;

public class TP17 {
    public static void main(String[] args) {
        int n = 100;
        int t = 4;
        StringBuffer s = new StringBuffer();
        int[] ints = new int[n];
        for (int i = 0; i< n; i++) {
            s.append(i+1);
        }
        System.out.println(s.charAt(s.length()-4));
    }
}

