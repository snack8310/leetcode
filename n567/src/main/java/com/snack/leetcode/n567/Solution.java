package com.snack.leetcode.n567;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int m = s1.length();
        int n = s2.length();
        if (m > n) {
            return false;
        }
        int left = 0;
        int right = 0;
        while (right < n) {
            Character c;
            while (right < m) {
                c = s2.charAt(right);
                right++;
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (isEnough(need, window)) {
                    return true;
                }
            }
            if (right >= n) {
                break;
            }
            c = s2.charAt(left);
            left++;
            window.put(c, window.getOrDefault(c, 0) - 1);
            c = s2.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (isEnough(need, window)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEnough(Map<Character, Integer> need, Map<Character, Integer> window) {
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            if (entry.getValue() > window.getOrDefault(entry.getKey(), 0)) {
                return false;
            }
        }
        return true;
    }

}
