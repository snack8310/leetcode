package com.snack.leetcode.n4;

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
    public void findMedianSortedArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double out = s.findMedianSortedArrays(nums1, nums2);
        double expected = 2.0000;
        Assert.assertEquals(expected, out, 0.000001);
    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double out = s.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5000;
        Assert.assertEquals(expected, out, 0.000001);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double out = s.findMedianSortedArrays(nums1, nums2);
        double expected = 2.5000;
        Assert.assertEquals(expected, out, 0.000001);
    }
}