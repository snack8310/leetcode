package com.snack.leetcode.n875;

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
    public void minEatingSpeed() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int out = s.minEatingSpeed(piles, h);
        int expert = 4;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minEatingSpeed2() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        int out = s.minEatingSpeed(piles, h);
        int expert = 30;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minEatingSpeed3() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;
        int out = s.minEatingSpeed(piles, h);
        int expert = 23;
        Assert.assertEquals(expert, out);
    }
}