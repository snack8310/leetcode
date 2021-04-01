package com.snack.leetcode.n1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num2Index = new HashMap<>();
        int n = nums.length;
        if (n <= 1) {
            return null;
        }
        int other;
        for (int i = 0; i < n; i++) {
            other = target - nums[i];
            if (num2Index.containsKey(other)) {
                int oI = num2Index.get(other);
                return new int[]{oI, i};
            }
            num2Index.put(nums[i], i);
        }
        return null;
    }
}
