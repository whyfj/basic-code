package com.fjc.offer2;

import java.util.*;

//数组中重复的数
//List<Integer> list = List.of(1, 2, 5);
public class Offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> dic = new HashSet<>();
        for (int num : nums){
            if(dic.contains(num)) return num;
            dic.add(num);
        }

        return -1;
    }
}

class Offer03_1 {
    public int findRepeatNumber(int[] nums) {
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