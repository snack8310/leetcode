package com.snack.leetcode.n879;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void profitableSchemes() {
        int n = 5;
        int minProfit = 3;
        int[] group = {2, 2};
        int[] profit = {2, 3};
        int out = solution.profitableSchemes(n, minProfit, group, profit);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }


    @Test
    public void profitableSchemes2() {
        int n = 10;
        int minProfit = 5;
        int[] group = {2, 3, 5};
        int[] profit = {6, 7, 8};
        int out = solution.profitableSchemes(n, minProfit, group, profit);
        int expected = 7;
        Assert.assertEquals(expected, out);
    }
}