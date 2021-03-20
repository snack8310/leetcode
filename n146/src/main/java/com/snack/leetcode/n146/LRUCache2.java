package com.snack.leetcode.n146;

import java.util.*;

public class LRUCache2 {

    LinkedHashMap<Integer, Integer> map;
    int capacity;

    public LRUCache2(int capacity) {
        map = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer rtn = map.get(key);
        if (rtn == null) {
            return -1;
        }
        makeRecently(key);
        return rtn;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            makeRecently(key);
            return;
        }
        while (map.size() >= capacity) {
            map.remove(map.keySet().iterator().next());
        }
        map.put(key, value);
    }

    private void makeRecently(int key) {
        int val = map.get(key);
        map.remove(key);
        map.put(key, val);
    }
}
