package com.snack.leetcode.n122;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution s;

    @Before
    public void init() {
        s = new Solution();
    }

    @Test
    public void maxProfit1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expert = 7;
        Assert.assertEquals(expert, s.maxProfit(prices));
    }

    @Test
    public void maxProfit2() {
        int[] prices = {1, 2, 3, 4, 5};
        int expert = 4;
        Assert.assertEquals(expert, s.maxProfit(prices));
    }

    @Test
    public void maxProfit3() {
        int[] prices = {7, 6, 4, 3, 1};
        int expert = 0;
        Assert.assertEquals(expert, s.maxProfit(prices));
    }
}
