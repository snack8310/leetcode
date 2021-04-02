package com.snack.leetcode.n494;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    Map<String, Integer> memo;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) {
            return 0;
        }
        memo = new HashMap<>();
        return backtrack(nums, 0, S);
    }

    private int backtrack(int[] nums, int i, int s) {
        if (i == nums.length) {
            if (s == 0) {
                return 1;
            }
            return 0;
        }
        String key = i + "," + s;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = 0;
        result += backtrack(nums, i + 1, s + nums[i]);
        result += backtrack(nums, i + 1, s - nums[i]);
        memo.put(key, result);
        return result;
    }
}
