package com.snack.leetcode.n14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }
        int left = 0;
        int right = minLength;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (isCommonPrefix(strs, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return strs[0].substring(0, left);
    }

    private boolean isCommonPrefix(String[] strs, int length) {
        String commonPrefix = strs[0].substring(0, length);
        for (int i = 1; i < strs.length; i++) {
            String tempCP = strs[i].substring(0, length);
            if (!tempCP.equals(commonPrefix)) {
                return false;
            }
        }
        return true;
    }
}
