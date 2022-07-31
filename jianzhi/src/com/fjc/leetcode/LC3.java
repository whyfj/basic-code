package com.fjc.leetcode;

import java.util.*;

public class LC3 {
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = 0, ans = 0;
        for (int i = 0; i < n; i++){
            if (i != 0) {
                occ.remove(s.charAt(i-1));
            }
            while (rk < n && !occ.contains(s.charAt(rk))){
                occ.add(s.charAt(rk));
                rk++;
            }
            ans = Math.max(ans, rk - i);
        }

        return ans;
    }
}


