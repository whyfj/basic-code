package com.fjc.method.dp;

public class Dp1 {
    public int coinChange(int[] A, int M) {
        int[] f = new int[M + 1];
        int n = A.length;
        f[0] = 0;
        int i,j;
        for (i = 1; i<=M; i++){
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < n; j++){
                if(i>= A[j] && f[i - A[j]] != Integer.MAX_VALUE){
                    f[i] = Math.min(f[i - A[j]]+1, f[i]);
                }
            }
            if (f[M] == Integer.MAX_VALUE){
                f[M] = -1;
            }
        }
        return f[M];
    }
}
