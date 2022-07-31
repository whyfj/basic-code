package com.fjc.method.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/M99OJA/
//分割回文子串
public class LeetCode086 {
    public static void main(String[] args) {
        String a = "aaa";
        LeetCode086 leetCode086 = new LeetCode086();
        String[][] test = leetCode086.partition(a);
        for (String[] s:test){
            System.out.println(Arrays.toString(s));
        }

    }
    public String[][] partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(res, path, s,0);
        String[][] ans = new String[res.size()][];
        for (int i=0; i<res.size(); i++){
            ans[i] = new String[res.get(i).size()];
            for (int j=0; j<ans[i].length; j++){
                ans[i][j] = res.get(i).get(j);
            }
        }
        return ans;
    }

    public void dfs(List<List<String>> res, List<String> path, String s, int startIndex){
        if (startIndex == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++){
            if (isPalindrome(s, startIndex, i)){
                path.add(s.substring(startIndex,i+1));
                dfs(res, path, s, i + 1);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}

