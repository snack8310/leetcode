package com.snack.leetcode.n1047;

public class Solution2 {
    public String removeDuplicates(String S) {
        int n = S.length();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && S.charAt(i) == S.charAt(i + 1)) {
                while (ret.length() != 0 && i + 2 < n && ret.charAt(ret.length() - 1) == S.charAt(i + 2)) {
                    ret.deleteCharAt(ret.length() - 1);
                    i++;
                }
                i++;
                continue;
            }
            ret.append(S.charAt(i));
        }
        return ret.toString();
    }
}
