package com.fjc.leetcode;

public class LC4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length, m = nums2.length;
        double ans = 1;
        if (n ==0 && m ==0) return ans;
        int t = (n+m) / 2, c = (n+m) % 2;
        int temp = 0;
        int i = 0, j = 0;
        while (i + j < t){
            if (i < n && nums1[i]<= nums2[j]){
                temp = nums1[i];
                i++;
            }else {
                temp = nums2[j];
                j++;
            }
        }
        if (c == 0){
            if (j == m || i < n && nums1[i]<= nums2[j]){
                ans = (temp + nums1[i]) / 2.0;
            }else {
                ans = (temp + nums2[j]) / 2.0;
            }
        }else {
            if (i < n && nums1[i]<= nums2[j]){
                ans = nums1[i];
            }else {
                ans = nums2[j];
            }
        }
        return ans;
    }
}
