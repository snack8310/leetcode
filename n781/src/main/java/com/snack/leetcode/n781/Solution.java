package com.snack.leetcode.n781;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> setAn = new HashMap<>();
        int rtn = 0;
        for (int an : answers) {
            if (!setAn.containsKey(an)) {
                rtn += an + 1;
            }
            if (setAn.getOrDefault(an, 0) == an) {
                setAn.remove(an);
            } else {
                setAn.put(an, setAn.getOrDefault(an, 0) + 1);
            }
        }
        return rtn;
    }
}
