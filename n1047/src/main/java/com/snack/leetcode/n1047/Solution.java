package com.snack.leetcode.n1047;

public class Solution {
    public String removeDuplicates(String S) {
        int n = S.length();
        StringBuilder builder;
        String ret = S;
        for (int i = 0; i < n - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                builder = new StringBuilder();
                builder.append(S.charAt(i));
                builder.append(S.charAt(i));
                ret = S.replace(builder.toString(), "");
                ret = removeDuplicates(ret);
                break;
            }
        }
        return ret;
    }
}
