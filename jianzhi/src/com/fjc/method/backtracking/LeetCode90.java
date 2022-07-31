package com.fjc.method.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode90 {
    public List<List<Integer>> result = new ArrayList<>();
    public LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0){
            result.add(path);
            return result;
        }
        Arrays.sort(nums);
        used = new boolean[nums.length];
        subsetsWithDupHelper(nums, 0);
        return result;
    }

    private void subsetsWithDupHelper(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path));
        if (startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i< nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && used[i-1] == false){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            subsetsWithDupHelper(nums, i + 1);
            used[i] = false;
            path.removeLast();
        }
    }
}
