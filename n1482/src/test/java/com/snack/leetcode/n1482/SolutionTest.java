package com.snack.leetcode.n1482;

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
    public void minDays() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;
        int out = s.minDays(bloomDay, m, k);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minDays2() {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 2;
        int out = s.minDays(bloomDay, m, k);
        int expected = -1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minDays3() {
        int[] bloomDay = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        int out = s.minDays(bloomDay, m, k);
        int expected = 12;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minDays4() {
        int[] bloomDay = {1000000000, 1000000000};
        int m = 1;
        int k = 1;
        int out = s.minDays(bloomDay, m, k);
        int expected = 1000000000;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minDays5() {
        int[] bloomDay = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int m = 4;
        int k = 2;
        int out = s.minDays(bloomDay, m, k);
        int expected = 9;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minDays6() {
        int[] bloomDay = {5, 37, 55, 92, 22, 52, 31, 62, 99, 64, 92, 53, 34, 84, 93, 50, 28};
        int m = 8;
        int k = 2;
        int out = s.minDays(bloomDay, m, k);
        int expected = 93;
        Assert.assertEquals(expected, out);
    }
}