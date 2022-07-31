package com.bishi;

import java.util.HashSet;
import java.util.Set;

public class TP15 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for (int num : nums){
            if(dic.contains(num)) return num;
            dic.add(num);
        }

        return -1;
    }

    public int findRepeatNumber1(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if(nums[i] == i){
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]){
                return nums[i];
            }
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }
}
