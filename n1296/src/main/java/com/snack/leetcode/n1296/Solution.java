package com.snack.leetcode.n1296;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 0) {
                return false;
            }
            while (entry.getValue() > 0) {
                Integer key = entry.getKey();
                entry.setValue(entry.getValue() - 1);
                int i = 1;
                while (i <= k - 1) {
                    if (!map.containsKey(key + i)) {
                        return false;
                    }
                    int value = map.get(key + i);
                    if (value < 1) {
                        return false;
                    }
                    map.put(key + i, value - 1);
                    i++;
                }
            }
        }
        return true;
    }
}
