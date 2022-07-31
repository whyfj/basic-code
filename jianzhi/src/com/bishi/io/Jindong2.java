package com.bishi.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jindong2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] L1 = new int[m];
        int[] L2 = new int[m];
        int[] Da = new int[m];
        int i = 0;
        while (i<m){
            L1[i] = sc.nextInt();
            L2[i] = sc.nextInt();
            Da[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(Da);
        System.out.println(Da[n/2]);

    }
}