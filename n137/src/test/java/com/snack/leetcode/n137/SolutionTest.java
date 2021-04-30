package com.snack.leetcode.n137;

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
    public void singleNumber() {
        int[] nums = {2, 2, 3, 2};
        int out = s.singleNumber(nums);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void singleNumber2() {
        int[] nums = {0, 1, 0, 1, 0, 1, 99};
        int out = s.singleNumber(nums);
        int expert = 99;
        Assert.assertEquals(expert, out);
    }
}