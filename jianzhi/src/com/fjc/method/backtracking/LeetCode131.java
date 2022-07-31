package com.fjc.method.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//分割回文串
public class LeetCode131 {
    List<List<String>> lists = new ArrayList<>();
    LinkedList<String> deque = new LinkedList<>();

    public List<List<String>> partition(String s){
        backTracking(s, 0);
        return lists;
    }

    public void backTracking(String s, int startIndex){
        // 收集结果条件，收集结果
        if (startIndex >= s.length()){
            lists.add(new ArrayList<>(deque));
            return;
        }

        // 回溯
        for (int i = startIndex; i < s.length(); i++){
            if(isPalindrome(s,startIndex,i)){
                String temp = s.substring(startIndex, i+1);
                deque.addLast(temp);
            } else {
                continue;
            }
            backTracking(s, i + 1);
            deque.removeLast();
        }
    }

    //判断是否为回文子串
    public boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i<j; i++, j--){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
