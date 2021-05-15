package com.snack.leetcode.n1296;

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
    public void isPossibleDivide() {
        int[] nums = {1, 2, 3, 3, 4, 4, 5, 6};
        int k = 4;
        boolean out = s.isPossibleDivide(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossibleDivide2() {
        int[] nums = {3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11};
        int k = 3;
        boolean out = s.isPossibleDivide(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossibleDivide3() {
        int[] nums = {3, 3, 2, 2, 1, 1};
        int k = 3;
        boolean out = s.isPossibleDivide(nums, k);
        Assert.assertTrue(out);
    }

    @Test
    public void isPossibleDivide4() {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        boolean out = s.isPossibleDivide(nums, k);
        Assert.assertFalse(out);
    }
}