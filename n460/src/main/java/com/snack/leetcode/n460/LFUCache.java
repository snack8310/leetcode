package com.snack.leetcode.n460;

import java.util.*;

public class LFUCache {

    Map<Integer, Integer> cache;
    Map<Integer, Integer> key2Freq;
    TreeMap<Integer, LinkedHashSet<Integer>> freq2Keys;
    int capacity;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        freq2Keys = new TreeMap<>();
        key2Freq = new HashMap<>();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    private void makeRecently(int key) {
        Integer freq = key2Freq.get(key);
        removeFromFreg2Keys(key, freq);
        freq++;
        key2Freq.put(key, freq);
        addToFreg2Keys(key, freq);
    }

    private void removeFromFreg2Keys(int key, Integer freq) {
        LinkedHashSet<Integer> keys = freq2Keys.get(freq);
        keys.remove(key);
        if (keys.size() == 0) {
            freq2Keys.remove(freq);
        }
    }

    private void addToFreg2Keys(int key, Integer freq) {
        LinkedHashSet<Integer> keys;
        keys = freq2Keys.get(freq);
        if (keys == null) {
            keys = new LinkedHashSet<>();
            freq2Keys.put(freq, keys);
        }
        keys.add(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) {
            return;
        }
        if (cache.containsKey(key)) {
            cache.put(key, value);
            makeRecently(key);
            return;
        }
        while (cache.size() >= capacity) {
            removeRecently();
        }
        cache.put(key, value);
        Integer freq = 1;
        key2Freq.put(key, freq);
        LinkedHashSet<Integer> keys = freq2Keys.get(freq);
        if (keys == null) {
            keys = new LinkedHashSet<>();
            freq2Keys.put(freq, keys);
        }
        keys.add(key);
    }

    private void removeRecently() {
        Integer freg = freq2Keys.keySet().iterator().next();
        LinkedHashSet<Integer> keys = freq2Keys.get(freg);
        Integer key = keys.iterator().next();
        cache.remove(key);
        key2Freq.remove(key);
        keys.remove(key);

    }
}



