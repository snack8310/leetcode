package com.snack.leetcode.n398;

import java.util.Random;

public class Solution {
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        Random random = new Random();
        int index = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (random.nextInt(++cnt) == 0) {
                    index = i;
                }
            }
        }
        return index;
    }
}
