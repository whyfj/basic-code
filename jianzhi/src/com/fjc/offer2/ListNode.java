package com.fjc.offer2;


public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = listNode;
        System.out.println(listNode1 == listNode);
    }
}
