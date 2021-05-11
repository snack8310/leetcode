package com.snack.leetcode.n659;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean isPossible(int[] nums) {
        int n = nums.length;
        LinkedHashMap<Integer, Integer> counts = new LinkedHashMap();
        for (int i = 0; i < n; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }
        Set<Integer> t;
        boolean retry = true;
        while (retry) {
            retry = false;
            t = new HashSet<>();
            Map.Entry<Integer, Integer> lastEntry = null;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 0) {
                    continue;
                }
                int curC = entry.getValue();
                if (curC > 1 && !retry) {
                    retry = true;
                }
                if (lastEntry != null && ((lastEntry.getValue() > curC - 1) || (entry.getKey() != lastEntry.getKey() + 1))) {
                    break;
                }
                lastEntry = entry;
                t.add(entry.getKey());
                entry.setValue(curC - 1);

            }
            if (t.size() < 3) {
                return false;
            }
        }
        return true;
    }
}
