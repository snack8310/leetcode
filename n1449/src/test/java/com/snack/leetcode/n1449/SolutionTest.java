package com.snack.leetcode.n1449;

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
    public void largestNumber() {
        int[] cost = {4, 3, 2, 5, 6, 7, 2, 5, 5};
        int target = 9;
        String out = solution.largestNumber(cost, target);
        String expected = "7772";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void largestNumber2() {
        int[] cost = {7, 6, 5, 5, 5, 6, 8, 7, 8};
        int target = 12;
        String out = solution.largestNumber(cost, target);
        String expected = "85";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void largestNumber3() {
        int[] cost = {2,4,6,2,4,6,4,4,4};
        int target = 5;
        String out = solution.largestNumber(cost, target);
        String expected = "0";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void largestNumber4() {
        int[] cost = {2,4,6,2,4,6,4,4,4};
        int target = 5;
        String out = solution.largestNumber(cost, target);
        String expected = "0";
        Assert.assertEquals(expected, out);
    }
}