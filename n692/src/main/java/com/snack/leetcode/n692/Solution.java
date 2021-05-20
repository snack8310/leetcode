package com.snack.leetcode.n692;

import java.util.*;

public class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> maps = new HashMap<>();
        for (String word : words) {
            maps.put(word, maps.getOrDefault(word, 0) + 1);
        }
        List<String> rets = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
            rets.add(entry.getKey());
        }
        Collections.sort(rets, (a1, a2) -> maps.get(a1) == maps.get(a2) ? a1.compareTo(a2) : maps.get(a2).compareTo(maps.get(a1)));
        return rets.subList(0, k);
    }
}

