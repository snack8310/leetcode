package com.snack.leetcode.n706;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMap {

    private static final int BASE = 769;
    private LinkedList<InnerData>[] data;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<>();
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int hash = hash(key);
        LinkedList<InnerData> d = data[hash];
        Iterator<InnerData> i = d.iterator();
        while (i.hasNext()) {
            InnerData id = i.next();
            if (key == id.key) {
                id.value = value;
                return;
            }
        }
        d.offerLast(new InnerData(key, value));
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int hash = hash(key);
        LinkedList<InnerData> d = data[hash];
        Iterator<InnerData> i = d.iterator();
        while (i.hasNext()) {
            InnerData id = i.next();
            if (key == id.key) {
                return id.value;
            }
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash = hash(key);
        LinkedList<InnerData> d = data[hash];
        Iterator<InnerData> i = d.iterator();
        while (i.hasNext()) {
            InnerData id = i.next();
            if (key == id.key) {
                i.remove();
            }
        }
    }

    final int hash(int key) {
        return key % BASE;
    }

    private class InnerData {
        int key;
        int value;

        public InnerData(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
