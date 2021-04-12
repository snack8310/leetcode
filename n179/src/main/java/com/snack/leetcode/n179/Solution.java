package com.snack.leetcode.n179;

import java.util.Arrays;

public class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] snums = new String[n];
        for (int i = 0; i < n; i++) {
            snums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(snums, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        StringBuffer sb = new StringBuffer();
        for (String s : snums) {
            sb.append(s);
        }
        if ("0".equals(snums[0])) {
            return "0";
        }
        return sb.toString();
    }
}
