package com.snack.leetcode.n167;

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
    public void twoSum() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] out = s.twoSum(numbers, target);
        int[] expert = {1, 2};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void twoSum2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] out = s.twoSum(numbers, target);
        int[] expert = {1, 3};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void twoSum3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] out = s.twoSum(numbers, target);
        int[] expert = {1, 2};
        Assert.assertArrayEquals(expert, out);
    }
}