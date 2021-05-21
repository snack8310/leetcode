package com.snack.leetcode.n1035;

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
    public void maxUncrossedLines() {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int out = s.maxUncrossedLines(nums1, nums2);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxUncrossedLines2() {
        int[] nums1 = {1, 4, 2};
        int[] nums2 = {1, 2, 4};
        int out = s.maxUncrossedLines(nums1, nums2);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxUncrossedLines3() {
        int[] nums1 = {1, 3, 7, 1, 7, 5};
        int[] nums2 = {1, 9, 2, 5, 1};
        int out = s.maxUncrossedLines(nums1, nums2);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}