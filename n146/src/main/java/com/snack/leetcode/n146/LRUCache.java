package com.snack.leetcode.n146;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LRUCache {

    Queue<Integer> queue;
    Map<Integer, Integer> map;
    int capacity;

    public LRUCache(int capacity) {
        queue = new LinkedList();
        map = new HashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer rtn = map.get(key);
        if (rtn == null) {
            return -1;
        }
        refreshKey(key);
        return rtn;
}

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            refreshKey(key);
            return;
        }
        while (queue.size() >= capacity) {
            map.remove(queue.poll());
        }
        queue.add(key);
        map.put(key, value);
    }

    private void refreshKey(int key){
        queue.remove(key);
        queue.add(key);
    }
}
