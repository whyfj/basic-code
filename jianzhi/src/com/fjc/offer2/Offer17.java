package com.fjc.offer2;

public class Offer17 {
    public int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; 1< end; i++){
            res[i] = i + 1;
        }
        return res;
    }
}
