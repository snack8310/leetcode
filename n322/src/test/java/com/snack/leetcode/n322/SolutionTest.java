package com.snack.leetcode.n322;

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
    public void coinChange() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int out = s.coinChange(coins, amount);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void coinChange2() {
        int[] coins = {2};
        int amount = 3;
        int out = s.coinChange(coins, amount);
        int expert = -1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void coinChange3() {
        int[] coins = {1};
        int amount = 0;
        int out = s.coinChange(coins, amount);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void coinChange4() {
        int[] coins = {1};
        int amount = 1;
        int out = s.coinChange(coins, amount);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void coinChange5() {
        int[] coins = {1};
        int amount = 2;
        int out = s.coinChange(coins, amount);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}