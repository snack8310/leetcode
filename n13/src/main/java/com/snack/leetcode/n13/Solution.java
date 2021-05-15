package com.snack.leetcode.n13;

public class Solution {

//    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    int[] nums0 = {900, 400, 90, 40, 9, 4};
    String[] symbols0 = {"CM", "CD", "XC", "XL", "IX", "IV"};

    int[] nums1 = {1000, 500, 100, 50, 10, 5, 1};
    String[] symbols1 = {"M", "D", "C", "L", "X", "V", "I"};

    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < symbols0.length; i++) {
            if (s.contains(symbols0[i])) {
                ans += nums0[i];
                s = s.replace(symbols0[i], "");
            }
        }
        for (int i = 0; i < symbols1.length; i++) {
            while (s.contains(symbols1[i])) {
                ans += nums1[i];
                s = s.replaceFirst(symbols1[i], "");
            }
        }
        return ans;
    }
}
