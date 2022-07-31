package com.fjc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("pear");
        set.add("orange");
        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            System.out.println(it.next());
            it.remove();
            System.out.println(set.toString());
        }
    }
}
