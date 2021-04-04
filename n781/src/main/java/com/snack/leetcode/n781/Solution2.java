package com.snack.leetcode.n781;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> setAn = new HashMap<>();
        int rtn = 0;
        for (int an : answers) {
            if (setAn.getOrDefault(an, 0) == 0) {
                setAn.put(an, an + 1);
                rtn += an + 1;
            } else {
                setAn.put(an, setAn.getOrDefault(an, 0) - 1);
            }
        }
        return rtn;
    }
}
