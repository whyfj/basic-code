package com.bishi;

import java.util.Scanner;
public class Main_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int count = 0; count < n; count++){
            def();
        }
    }

    private static void def() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] yuan = new int[m];
        for (int i = 0; i < m; i++){
            yuan[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m-1; i++){
            for (int j = i + 1; j <m; j++){
                if (yuan[i] == yuan[j]){
                    yuan[i] += 100;
                    break;
                }
            }
        }
        int t = 0;
        for (int i = 0; i < m; i++){
            if (yuan[i]> 100){
                t +=1;
            }
        }
        System.out.println(t);
    }
}

