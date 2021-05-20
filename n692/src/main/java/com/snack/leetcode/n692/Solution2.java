package com.snack.leetcode.n692;

import java.util.*;

public class Solution2 {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> maps = new HashMap<>();
        for (String word : words) {
            maps.put(word, maps.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>(
                (a1, a2) -> maps.get(a1) == maps.get(a2) ? a1.compareTo(a2) : maps.get(a2).compareTo(maps.get(a1)));
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            minHeap.offer(entry.getKey());
        }
        List<String> rets = new ArrayList<>();
        while (k > 0) {
            rets.add(minHeap.poll());
            k--;
        }
        return rets;
    }
}

