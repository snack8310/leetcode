package com.snack.leetcode.n167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int n = numbers.length;
        int right = n - 1;
        int[] rtn = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                rtn[0] = left + 1;
                rtn[1] = right + 1;
                return rtn;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return rtn;
    }
}
