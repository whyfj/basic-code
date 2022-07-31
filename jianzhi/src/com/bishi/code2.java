package com.bishi;

import java.math.BigInteger;

public class code2 {
    public static void main(String[] args) {
        long s = 6;
        long k = s * 20;
        long y = s * 12;
        BigInteger a;
        BigInteger res = new BigInteger("1");
        System.out.println(k);
        System.out.println(y);
        for (int i = 1; i<=y; i++){
            //a = new BigInteger(String.valueOf(k-i+1));
            res = res.multiply(BigInteger.valueOf(k-i+1));
        }
        for (int i = 1; i<=y; i++){
            a = new BigInteger(String.valueOf(i));
            res = res.divide(a);
        }
        long z = 202220222022L;
        BigInteger x = BigInteger.valueOf(z);
        System.out.println(x);
        res= res.mod(x);
        System.out.println(res);
    }
}
