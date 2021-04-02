package com.snack.leetcode.n494;

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
    public void findTargetSumWays() {
        int[] nums = {1, 1, 1, 1, 1};
        int S = 3;
        int out = s.findTargetSumWays(nums, S);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }
}