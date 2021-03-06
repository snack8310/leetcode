package com.snack.leetcode.n503;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        int[] ret = new int[l];
        for (int i = 0; i < l; i++) {
            for (int j = i; j < 2 * l - 1; j++) {
                if (nums[i] < nums[j % l]) {
                    ret[i] = nums[j % l];
                    break;
                }
                ret[i] = -1;
            }
        }
        return ret;
    }
}
