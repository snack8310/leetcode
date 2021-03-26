package com.snack.leetcode.n76;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int retL;
    int retR;

    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, (need.getOrDefault(c, 0) + 1));
        }
        int n = s.length();
        int left = 0;
        int right = 0;
        retL = 0;
        retR = Integer.MAX_VALUE;
        while (right < n) {
            char c = s.charAt(right);
            right++;
            window.put(c, (window.getOrDefault(c, 0) + 1));
            if (isEnough(window, need)) {
                setToRnt(left, right);
                while (left < right) {
                    char c1 = s.charAt(left);
                    left++;
                    window.put(c1, (window.get(c1) - 1));
                    if (!isEnough(window, need)) {
                        break;
                    }
                    setToRnt(left, right);

                }
            }
        }
        if(retR>n){
            return "";
        }
        return s.substring(retL, retR);
    }

    private void setToRnt(int left, int right) {
        if (retR - retL > right - left) {
            retR = right;
            retL = left;
        }
    }

    private boolean isEnough(Map<Character, Integer> window, Map<Character, Integer> need) {
        for (Map.Entry<Character, Integer> entry : need.entrySet()) {
            if (entry.getValue() > window.getOrDefault(entry.getKey(), -1)) {
                return false;
            }
        }
        return true;
    }
}
