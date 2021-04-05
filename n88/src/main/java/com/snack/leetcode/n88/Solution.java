package com.snack.leetcode.n88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int[] sorted = new int[m + n];
        int i = 0;
        while (left < m || right < n) {
            if (left == m) {
                sorted[i++] = nums2[right++];
            } else if (right == n) {
                sorted[i++] = nums1[left++];
            } else if (nums1[left] == nums2[right]) {
                sorted[i++] = nums1[left++];
                sorted[i++] = nums2[right++];
            } else if (nums1[left] < nums2[right]) {
                sorted[i++] = nums1[left++];
            } else {
                sorted[i++] = nums2[right++];
            }
        }
        for (int j = 0; j < m + n; j++) {
            nums1[j] = sorted[j];
        }
    }
}
