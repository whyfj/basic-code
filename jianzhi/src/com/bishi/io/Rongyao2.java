package com.bishi.io;


import java.util.Scanner;

public class Rongyao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[5];
        int[] A = {1,3,7,11,13};
        for(int i = 0; i < 5; i++){
            count[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        if (money<=0){
            System.out.println(0);
            return;
        }
        System.out.println(size(A,money,count));

    }

    public static int size(int[] A, int M, int[] count) {
        int[] f = new int[M + 1];
        int x[][] = new int[M + 1][5];
        int n = A.length;
        f[0] = 0;
        int i,j;
        for (i = 1; i<=M; i++){
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < n; j++){
                if(i>= A[j] && f[i - A[j]] != Integer.MAX_VALUE && x[i - A[j]][j] + 1<= count[j]){
                    f[i] = Math.min(f[i - A[j]]+1, f[i]);
                    x[i][j] = x[i - A[j]][j] + 1;
                }
            }
            if (f[M] == Integer.MAX_VALUE){
                f[M] = -1;
            }
        }
        return f[M];
    }

}
