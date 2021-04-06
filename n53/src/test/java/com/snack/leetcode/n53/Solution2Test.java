package com.snack.leetcode.n53;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void maxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int out = s.maxSubArray(nums);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void maxSubArray2() {
        int[] nums = {1};
        int out = s.maxSubArray(nums);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void maxSubArray3() {
        int[] nums = {0};
        int out = s.maxSubArray(nums);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}