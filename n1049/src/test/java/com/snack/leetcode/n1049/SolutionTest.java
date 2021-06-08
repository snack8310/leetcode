package com.snack.leetcode.n1049;

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
    public void lastStoneWeightII() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int out = solution.lastStoneWeightII(stones);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }


    @Test
    public void lastStoneWeightII2() {
        int[] stones = {31, 26, 33, 21, 40};
        int out = solution.lastStoneWeightII(stones);
        int expected = 5;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void lastStoneWeightII3() {
        int[] stones = {1, 2};
        int out = solution.lastStoneWeightII(stones);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }
}