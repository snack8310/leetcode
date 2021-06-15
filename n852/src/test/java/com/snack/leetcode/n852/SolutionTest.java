package com.snack.leetcode.n852;

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
    public void peakIndexInMountainArray() {
        int[] arr = {0, 1, 0};
        int out = solution.peakIndexInMountainArray(arr);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void peakIndexInMountainArray2() {
        int[] arr = {0, 2, 1, 0};
        int out = solution.peakIndexInMountainArray(arr);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void peakIndexInMountainArray3() {
        int[] arr = {0, 10, 5, 2};
        int out = solution.peakIndexInMountainArray(arr);
        int expected = 1;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void peakIndexInMountainArray4() {
        int[] arr = {3, 4, 5, 1};
        int out = solution.peakIndexInMountainArray(arr);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void peakIndexInMountainArray5() {
        int[] arr = {24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        int out = solution.peakIndexInMountainArray(arr);
        int expected = 2;
        Assert.assertEquals(expected, out);
    }
}