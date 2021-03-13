package com.snack.leetcode.n705;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet {

    private static final int BASE = 769;
    private LinkedList<Integer>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<Integer>();
        }
    }

    public void add(int key) {
        int h = hash(key);
        LinkedList<Integer> l = data[h];
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value == key) {
                return;
            }
        }
        data[h].offerLast(key);
    }

    public void remove(int key) {
        int h = hash(key);
        LinkedList<Integer> l = data[h];
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value == key) {
                it.remove();
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        int h = hash(key);
        LinkedList<Integer> l = data[h];
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value == key) {
                return true;
            }
        }
        return false;
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        for (LinkedList<Integer> d : data) {
            if (d.size() == 0) {
                continue;
            }
            for (Integer it : d) {
                sb.append(it);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    final int hash(int key) {
        return key % BASE;
    }
}
