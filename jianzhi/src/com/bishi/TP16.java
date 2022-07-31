package com.bishi;

import java.util.*;
//旋转数组中查找位置
public class TP16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int target = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String[] str = s.split(" ");
            int[] ints = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                ints[i] = Integer.valueOf(str[i]);
            }
            int a = minArray(ints);
            if (ints[ints.length-1] > target){
                System.out.println(commonBinarySearch(ints, target, a, ints.length-1));
            }else {
                System.out.println(commonBinarySearch(ints, target, 0, a-1));
            }
        }
    }

    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return i;
    }

    public static int commonBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle;            //定义middle

        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] > key) {
                //比关键字大则关键字在左区域
                high = middle - 1;
            } else if (arr[middle] < key) {
                //比关键字小则关键字在右区域
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;        //最后仍然没有找到，则返回-1
    }

}

class TPL16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String re = "\\[|\\]|:|：";
        String[] ar = sc.nextLine().split(re);
        for (int i=0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
        String[] arr = ar[2].split(",");
        int[] ints = new int[arr.length];
        for (int i=0; i < arr.length; i++){
            ints[i] = Integer.parseInt(arr[i]);
        }
        int target = Integer.parseInt(ar[4]);
        int a = minArray(ints);
        if (ints[ints.length-1] > target){
            System.out.println(commonBinarySearch(ints, target, a, ints.length-1));
        }else {
            System.out.println(commonBinarySearch(ints, target, 0, a-1));
        }
    }

    public static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m + 1;
            else if (numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return i;
    }

    public static int commonBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        int middle;

        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] > key) {
                high = middle - 1;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}