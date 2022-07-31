package com.bishi.io;


import java.util.Scanner;

public class Rongyao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int mark[] = new int[n + 1];
        mark[0] = 0;
        mark[1] = arr[0];
        mark[2] = arr[1];
        for (int i = 3; i < n+1; i++){
            mark[i] = Math.max(mark[i-2],mark[i-3]) + arr[i-1];
        }
        System.out.println(Math.max(mark[n],mark[n-1]));
    }
}