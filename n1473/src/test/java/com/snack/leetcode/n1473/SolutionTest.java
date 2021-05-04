package com.snack.leetcode.n1473;

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
    public void minCost() {
        int[] houses = {0, 0, 0, 0, 0};
        int[][] cost = {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}};
        int m = 5;
        int n = 2;
        int target = 3;
        int out = s.minCost(houses, cost, m, n, target);
        int expert = 9;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void minCost2() {
        int[] houses = {0, 2, 1, 2, 0};
        int[][] cost = {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}};
        int m = 5;
        int n = 2;
        int target = 3;
        int out = s.minCost(houses, cost, m, n, target);
        int expert = 11;
        Assert.assertEquals(expert, out);
    }
}