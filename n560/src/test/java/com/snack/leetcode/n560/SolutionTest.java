package com.snack.leetcode.n560;

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
    public void subarraySum() {
        int[] nums = {1, 1, 1};
        int k = 2;
        int out = s.subarraySum(nums, k);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}