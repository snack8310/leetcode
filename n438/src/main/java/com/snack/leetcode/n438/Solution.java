package com.snack.leetcode.n438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        int m = p.length();
        List<Integer> rtn = new ArrayList<>();
        if (n == 0 || m == 0 || n < m) {
            return rtn;
        }
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : p.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left, right;
        left = right = 0;
        while (right < m) {
            char rc;
            rc = cs[right];
            window.put(rc, window.getOrDefault(rc, 0) + 1);
            right++;
        }
        if (isEnough(need, window)) {
            rtn.add(left);
        }
        while (right < n) {
            char rc;
            char lc = cs[left];
            rc = cs[right];
            window.put(lc, window.getOrDefault(lc, 0) - 1);
            window.put(rc, window.getOrDefault(rc, 0) + 1);
            left++;
            right++;
            if (isEnough(need, window)) {
                rtn.add(left);
            }
        }
        return rtn;
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
