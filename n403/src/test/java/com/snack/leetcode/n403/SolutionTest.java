package com.snack.leetcode.n403;

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
    public void canCross() {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        boolean out = s.canCross(stones);
        Assert.assertTrue(out);
    }

    @Test
    public void canCross2() {
        int[] stones = {0, 1, 2, 3, 4, 8, 9, 11};
        boolean out = s.canCross(stones);
        Assert.assertFalse(out);
    }
}