package com.snack.leetcode.n121;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void maxProfit() {
        int[] prices = {10, 14, 15, 18, 14, 22};
        int expert = 12;
        Assert.assertEquals(expert, s.maxProfit(prices));
    }

    @Test
    public void maxProfit2() {
        int[] prices = {2, 4, 1};
        int expert = 2;
        Assert.assertEquals(expert, s.maxProfit(prices));
    }
}