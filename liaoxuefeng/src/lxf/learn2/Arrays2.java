package lxf.learn2;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        System.out.println(ns.length); // 3
        int[] arr0 = ns[0];
        System.out.println(arr0.length); // 4
        System.out.println(ns[1][2]); // 7

        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(ns));

    }
}
