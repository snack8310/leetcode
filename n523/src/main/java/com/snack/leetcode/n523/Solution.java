package com.snack.leetcode.n523;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) {
            return false;
        }
        int[] sums = new int[n + 1];
        sums[0] = 0;
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            set.add(sums[i - 2] % k);
            if (set.contains(sums[i] % k)) return true;
        }
        return false;
    }
}
