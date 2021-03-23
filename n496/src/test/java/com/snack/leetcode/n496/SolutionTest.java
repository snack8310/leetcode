package com.snack.leetcode.n496;

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
    public void nextGreaterElement() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] out = s.nextGreaterElement(nums1, nums2);
        int[] expert = {-1, 3, -1};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void nextGreaterElement2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] out = s.nextGreaterElement(nums1, nums2);
        int[] expert = {3, -1};
        Assert.assertArrayEquals(expert, out);
    }
}