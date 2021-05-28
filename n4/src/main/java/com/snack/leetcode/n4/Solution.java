package com.snack.leetcode.n4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k = (m + n + 1) / 2;
        int k1 = (m + n + 2) / 2;
        return (getKth(nums1, 0, m - 1, nums2, 0, n - 1, k) + getKth(nums1, 0, m - 1, nums2, 0, n - 1, k1)) * 0.5;
    }

    private double getKth(int[] nums1, int n1Start, int n1End, int[] nums2, int n2Start, int n2End, int k) {
        int len1 = n1End - n1Start + 1;
        int len2 = n2End - n2Start + 1;
        if (len1 > len2) {
            return getKth(nums2, n2Start, n2End, nums1, n1Start, n1End, k);
        }
        if (len1 == 0) {
            return nums2[n2Start + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[n1Start], nums2[n2Start]);
        }
        int i = n1Start + Math.min(len1, k / 2) - 1;
        int j = n2Start + Math.min(len2, k / 2) - 1;
        if (nums1[i] > nums2[j]) {
            return getKth(nums1, n1Start, n1End, nums2, j + 1, n2End, k - (j - n2Start + 1));
        } else {
            return getKth(nums1, i + 1, n1End, nums2, n2Start, n2End, k - (i - n1Start + 1));
        }
    }
}
