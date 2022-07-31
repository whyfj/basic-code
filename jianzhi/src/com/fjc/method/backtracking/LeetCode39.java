package com.fjc.method.backtracking;

import java.util.*;


/*
给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的数字可以无限制重复被选取。
*/
public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0,0, path, res);
        return res;
    }

    private void dfs(int[] candidates, int target, int sum, int startIndex,
             Deque<Integer> path, List<List<Integer>> res){
        //因为剪枝，可以不要
        if (target < sum) {
            return;
        }
        if (target == sum) {
            res.add(new ArrayList<>(path));
            return;
        }


        for (int i = startIndex; i<candidates.length && sum + candidates[i]<=target; i++){
            sum += candidates[i];
            path.addLast(candidates[i]);
            dfs(candidates, target , sum , i, path, res);
            path.removeLast();
            sum -= candidates[i];
        }
    }
}
