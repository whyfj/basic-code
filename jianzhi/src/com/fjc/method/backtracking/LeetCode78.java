package com.fjc.method.backtracking;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
//解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
public class LeetCode78 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsHelper(nums, 0);
        return result;

    }

    private void subsetsHelper(int[] nums, int startIndex){
        result.add(new ArrayList<>(path));
        if(startIndex >= nums.length) return;
        for (int i = startIndex; i < nums.length; i++){
            path.add(nums[i]);
            subsetsHelper(nums, i + 1);
            path.removeLast();
        }
    }
}
