package com.snack.leetcode.n13;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    int[] nums = {1000, 500, 100, 50, 10, 5, 1};
    char[] symbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        for (int i = 0; i < symbols.length; i++) {
            map.put(symbols[i], nums[i]);
        }
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
