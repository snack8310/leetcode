package com.snack.leetcode.n877;

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
    public void stoneGame() {
        int[] piles = {5, 3, 4, 5};
        boolean out = s.stoneGame(piles);
        Assert.assertTrue(out);
    }
}