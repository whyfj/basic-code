package com.fjc.method.dp;

//跳格子
public class Tiaogezi {
    public static boolean canJump(int[] A){
        int n = A.length;
        boolean[] f = new boolean[n];
        int[] ints = new int[n];
        f[0] = true;
        ints[0] = A[0];
        for (int j = 1; j < n; j++){
            f[j] = false;
            ints[j] = -1;
            for (int i = 0; i<j; i++){
                if(f[i] && (ints[i] >=  Math.pow(j-i,2))){
                    f[j] = true;
                    int temp = (int) (A[j]+ints[i]- Math.pow(j-i,2));
                    ints[j] = ints[j]>temp ? ints[j]: temp;
                }
            }
        }
        return f[n-1];
    }

    public static void main(String[] args) {
        int[] a = {2, -1, 0};
        System.out.println(canJump(a));
    }
}
