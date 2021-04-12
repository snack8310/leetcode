package com.snack.leetcode.o45;

import java.util.Arrays;

public class Solution {
    public String minNumber(int[] nums) {
        int n = nums.length;
        String[] snums = new String[n];
        for (int i = 0; i < n; i++) {
            snums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(snums, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(snums[i]);
        }
        return sb.toString();
    }
}
