package com.snack.leetcode.n1047;

public class Solution2 {
    public String removeDuplicates(String S) {
        int n = S.length();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (ret.length() != 0 && ret.charAt(ret.length() - 1) == S.charAt(i)) {
                ret.deleteCharAt(ret.length() - 1);
            } else {
                ret.append(S.charAt(i));
            }
        }
        return ret.toString();
    }
}
