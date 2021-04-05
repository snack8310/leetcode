package com.snack.leetcode.n88;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        s.merge(nums1, m, nums2, n);
        int[] expert = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expert, nums1);
    }

    @Test
    public void merge2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        s.merge(nums1, m, nums2, n);
        int[] expert = {1};
        Assert.assertArrayEquals(expert, nums1);
    }
}