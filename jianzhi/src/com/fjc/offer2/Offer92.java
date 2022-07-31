package com.fjc.offer2;

public class Offer92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = new ListNode(-1);
        if (left == 1){
            pre.next = head;
        } else {
            pre = head;
        }
        ListNode res = head;
        for (int i = 1; i < left -1; i++){
            pre = pre.next;
        }
        ListNode temp1 = pre;
        pre = pre.next;
        ListNode temp2 = pre;
        if (pre == null) return res;
        ListNode cur = pre.next;
        if (cur == null) {
            if (right - left == 0) return res;
            if (right - left == 1) {
                pre.next = temp1;
                temp1.next = null;
                return pre;
            }
        }
        ListNode nxt = cur.next;
        for (int i = 0; i < right - left; i++){
            cur.next = pre;
            pre = cur;
            cur = nxt;
            if (nxt != null) nxt = nxt.next;
        }
        if (left > 1) {
            temp1.next = pre;
            temp2.next = cur;
            return res;
        }
        temp2.next = cur;
        return pre;
    }
}

class Offer92_1 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < left -1; i++){
            pre = pre.next;
        }
        ListNode temp1 = pre;
        if (pre.next.next == null) return dummyNode.next;
        pre = pre.next;
        ListNode temp2 = pre;
        ListNode cur = pre.next;
        if (cur == null) {
            if (right - left == 0) return dummyNode.next;
            if (right - left == 1) {
                pre.next = temp1;
                temp1.next = null;
                return pre;
            }
        }
        ListNode next = cur.next;
        for (int i = 0; i < right - left; i++) {
            cur.next = pre;
            pre = cur;
            cur = next;
            if (next != null) next = next.next;
        }
        temp1.next = pre;
        temp2.next = cur;
        return dummyNode.next;

    }
}

