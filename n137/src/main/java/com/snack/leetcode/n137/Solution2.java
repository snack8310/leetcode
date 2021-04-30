package com.snack.leetcode.n137;

public class Solution2 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) {
                sum += ((num >> i) & 1);
            }
            if (sum % 3 == 1) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
