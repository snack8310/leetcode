package com.snack.leetcode.n80;

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
    public void removeDuplicates() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int out = s.removeDuplicates(nums);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int out = s.removeDuplicates(nums);
        int expert = 7;
        Assert.assertEquals(expert, out);
    }
}