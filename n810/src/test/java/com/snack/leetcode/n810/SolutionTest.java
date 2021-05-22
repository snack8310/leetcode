package com.snack.leetcode.n810;

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
    public void xorGame() {
        int[] nums = {1, 1, 2};
        boolean out = s.xorGame(nums);
        Assert.assertFalse(out);
    }
}