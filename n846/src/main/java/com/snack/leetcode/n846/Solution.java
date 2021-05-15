package com.snack.leetcode.n846;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : hand) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 0) {
                continue;
            }
            if (value < 0) {
                return false;
            }
            while (entry.getValue() > 0) {
                entry.setValue(entry.getValue() - 1);
                int i = 1;
                while (i <= groupSize - 1) {
                    if (!map.containsKey(key + i)) {
                        return false;
                    }
                    int v = map.get(key + i);
                    if (v <= 0) {
                        return false;
                    }
                    map.put(key + i, v - 1);
                    i++;
                }
            }
        }
        return true;
    }
}
