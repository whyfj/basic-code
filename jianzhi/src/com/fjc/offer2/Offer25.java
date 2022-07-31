package com.fjc.offer2;

public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = null;
        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        }else {
            head = l2;
            l2 = l2.next;
        }
        ListNode tempNode = head;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                tempNode.next = l1;
                l1 = l1.next;
                tempNode = tempNode.next;
            }else {
                tempNode.next = l2;
                l2 = l2.next;
                tempNode = tempNode.next;
            }
        }
        if (l1 == null){
            tempNode.next = l2;
        }else {
            tempNode.next = l1;
        }
        return head;
    }
}