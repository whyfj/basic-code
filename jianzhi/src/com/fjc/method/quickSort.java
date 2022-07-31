package com.fjc.method;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 19, 7, 3, 0, 10, 17};
        quick_sort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] s, int l, int r){
        int x = s[l];
        int i = l, j = r;
        while (i < j){
            // 从右向左找小于x的数来填s[i]
            while(i < j && s[j] >= x)
                j--;
            if(i < j)
            {
                s[i] = s[j]; //将s[j]填到s[i]中，s[j]就形成了一个新的坑
                i++;
            }

            // 从左向右找大于或等于x的数来填s[j]
            while(i < j && s[i] < x)
                i++;
            if(i < j)
            {
                s[j] = s[i]; //将s[i]填到s[j]中，s[i]就形成了一个新的坑
                j--;
            }
        }
        s[i] = x;
        return i;
    }

    public static void quick_sort(int s[], int l, int r){
        if (l < r){
            int i = partition(s, l, r);
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

    public static void quick_sort1(int s[], int l, int r){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(r);
        stack.addLast(l);
        while (!stack.isEmpty()){
            int left = stack.removeLast();
            int right = stack.removeLast();
            int pi = partition(s, left, right);
            if (left < pi -1){
                stack.addLast(pi -1);
                stack.addLast(left);
            }
            if (pi + 1 < right){
                stack.addLast(right);
                stack.addLast(pi + 1);
            }
        }
    }
    public static void quick_sort2(int[] a, int low, int high) {
        int pivot;
        if (low >= high)
            return;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(low);
        stack.push(high);
        while (!stack.empty()) {
            // 先弹出high,再弹出low
            high = stack.pop();
            low = stack.pop();
            pivot = partition(a, low, high);
            // 先压low,再压high
            if (low < pivot - 1) {
                stack.push(low);
                stack.push(pivot - 1);
            }
            if (pivot + 1 < high) {
                stack.push(pivot + 1);
                stack.push(high);
            }
        }
    }
}
