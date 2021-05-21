package com.snack.leetcode.n5;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxV = 0;
        String ret = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            // 单
            int j = 1;
            while (i - j >= 0 && i + j < n) {
                if (s.charAt(i - j) != s.charAt(i + j)) {
                    break;
                }
                sb.insert(0, s.charAt(i - j));
                sb.append(s.charAt(i + j));
                j++;
            }
            if (maxV < 2 * j - 1) {
                maxV = 2 * j - 1;
                ret = sb.toString();
            }
            //双
            if (i + 1 >= n) {
                continue;
            }
            char c1 = s.charAt(i + 1);
            if (c != c1) {
                continue;
            }
            sb = new StringBuilder();
            sb.append(c);
            sb.append(c1);
            j = 1;
            while (i - j >= 0 && i + 1 + j < n) {
                if (s.charAt(i - j) != s.charAt(i + 1 + j)) {
                    break;
                }
                sb.insert(0, s.charAt(i - j));
                sb.append(s.charAt(i + 1 + j));
                j++;
            }
            if (maxV < 2 * j) {
                maxV = 2 * j;
                ret = sb.toString();
            }
        }
        return ret;
    }
}
