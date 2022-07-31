package com.bishi.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Jindong1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < t; i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        int min = temp.get(0);
        int max = temp.get(t-1);
        if (min == max) {
            System.out.println(2);
            return;
        }
        int minIndex = arr.indexOf(min) + 1;
        int maxIndex = arr.indexOf(max) + 1;
        int[] res = new int[3];
        res[0] = Math.max(maxIndex, minIndex);
        res[1] = Math.max(t-maxIndex+1, t-minIndex+1);
        int x = maxIndex > minIndex? maxIndex-minIndex:minIndex-maxIndex;
        res[2] = t - x + 1;
        Arrays.sort(res);
        System.out.println(res[0]);
    }
}