package com.fjc.method.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LeetCode491 {
    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    private void backtracking(int[] nums, int startIndex) {
        if (path.size() > 1) {
            result.add(new ArrayList<>(path));
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++){
            if ((!path.isEmpty() && path.getLast() > nums[i])
                    || set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            path.addLast(nums[i]);
            backtracking(nums, i + 1);
            path.removeLast();

        }
    }
}




