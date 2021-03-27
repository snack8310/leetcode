package com.snack.leetcode.n3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int rtn = 0;
        Map<Character, Integer> need = new HashMap<>();
        char c;
        while (left < n) {
            while (right < n) {
                c = s.charAt(right);
                need.put(c, need.getOrDefault(c, 0) + 1);
                right++;
                if (!isEnough(need)) {
                    break;
                }
                rtn = rtn > right - left ? rtn : right - left;
            }
            c = s.charAt(left);
            need.put(c, need.getOrDefault(c, 0) - 1);
            left++;
        }
        return rtn;
    }

    private boolean isEnough(Map<Character, Integer> need) {
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}
