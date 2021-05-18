package com.snack.leetcode.n1442;

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
    public void countTriplets() {
        int[] arr = {2, 3, 1, 6, 7};
        int out = s.countTriplets(arr);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void countTriplets2() {
        int[] arr = {1, 1, 1, 1, 1};
        int out = s.countTriplets(arr);
        int expected = 10;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void countTriplets3() {
        int[] arr = {2, 3};
        int out = s.countTriplets(arr);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void countTriplets4() {
        int[] arr = {1, 3, 5, 7};
        int out = s.countTriplets(arr);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void countTriplets5() {
        int[] arr = {7, 11, 12, 9, 5, 2, 7, 17, 22};
        int out = s.countTriplets(arr);
        int expected = 8;
        Assert.assertEquals(expected, out);
    }

}