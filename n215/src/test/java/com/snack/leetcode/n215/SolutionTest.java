package com.snack.leetcode.n215;

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
    public void findKthLargest() {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int out = s.findKthLargest(nums, k);
        int expected = 5;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void findKthLargest2() {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int out = s.findKthLargest(nums, k);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }
}