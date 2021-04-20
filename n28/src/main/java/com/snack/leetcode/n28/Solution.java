package com.snack.leetcode.n28;

public class Solution {
    public int strStr(String haystack, String needle) {
        char[] cn = needle.toCharArray();
        if (cn.length == 0) {
            return 0;
        }
        char[] hm = haystack.toCharArray();
        for (int i = 0; i < hm.length; i++) {
            int hi = i;
            int ci = 0;
            while (hi < hm.length && ci < cn.length && hm[hi] == cn[ci]) {
                hi++;
                ci++;
            }
            if (ci == cn.length) {
                return i;
            }
        }
        return -1;
    }
}
