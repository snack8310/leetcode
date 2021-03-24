package com.snack.leetcode.n1011;

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
    public void shipWithinDays() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int D = 5;
        int out = s.shipWithinDays(weights, D);
        int expert = 15;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void shipWithinDays2() {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int D = 3;
        int out = s.shipWithinDays(weights, D);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void shipWithinDays3() {
        int[] weights = {1, 2, 3, 1, 1};
        int D = 4;
        int out = s.shipWithinDays(weights, D);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }
}