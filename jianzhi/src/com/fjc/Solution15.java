package com.fjc;

import java.util.*;

public class Solution15 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        Solution test = new Solution();
        System.out.println(test.threeSum(nums));

    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int first = 0; first< n - 2; first++){
            if (first > 0 && nums[first] == nums[first-1]){
                continue;
            }
            int third = n - 1;
            for (int second = first + 1; second < n; second++){
                if (second > first + 1 && nums[second] == nums[second - 1]){
                    continue;
                }
                while (second < third && nums[first] + nums[second] + nums[third] > 0){
                    third--;
                }
                if (second == third) break;
                if (nums[first] + nums[second] + nums[third] == 0){
//                    List<Integer> list = new ArrayList<Integer>();
//                    list.add(nums[first]);
//                    list.add(nums[second]);
//                    list.add(nums[third]);
                    List<Integer> list = new ArrayList<Integer>(Arrays.asList(nums[first], nums[second], nums[third]));
                    ans.add(list);
                }

            }
        }
        return ans;
    }
}



