package com.snack.leetcode.o42;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void maxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int out = solution.maxSubArray(nums);
        int expected = 6;
        Assert.assertEquals(expected, out);
    }
}