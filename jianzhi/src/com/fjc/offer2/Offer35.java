package com.fjc.offer2;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Offer35 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp != null){
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }
        temp = head;
        Node newhead = temp.next;
        Node newtemp = temp.next;
        while (temp != null){
            temp.next = temp.next.next;
            temp = temp.next;
            if (newtemp.next != null){
                newtemp.next = newtemp.next.next;
                newtemp = newtemp.next;
            }
        }
        return newhead;
    }
}
