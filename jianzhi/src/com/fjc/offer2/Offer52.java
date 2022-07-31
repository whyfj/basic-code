package com.fjc.offer2;

public class Offer52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != null && B != null){
            A = A.next;
            B = B.next;
        }
        while (A != null){
            A = A.next;
            headA = headA.next;
        }
        while (B != null){
            B = B.next;
            headB = headB.next;
        }
        while ( headA.val != headB.val){
            headA = headA.next;
            headB = headB.next;
        }
        return  headA;
    }
}
