package com.bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int[] b;
        int[] c;
        int[] d;
        int n = sc.nextInt();
        int m = sc.nextInt();
        a = new int[n];
        b = new int[m];
        c = new int[n];
        d = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            d[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int money = 0;
            int t = 0;
            for (int j = 0; j < m; j++){
                if (b[j] >= c[i]){
                    money += b[j];
                    t += 1;
                    if (t == a[i]){
                        d[i] = money;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(d[i]);
            System.out.print(' ');
        }
        System.out.print(d[n-1]);
    }

    public static void main(String[] args) {
        main();
    }
}
