package com.snack.leetcode.n852;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid >= 1 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
                continue;
            }
            if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                left = mid + 1;
                continue;
            }
            return mid;
        }
        return left;
    }
}
