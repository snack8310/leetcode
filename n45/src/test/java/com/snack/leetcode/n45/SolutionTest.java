package com.snack.leetcode.n45;

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
    public void jump() {
        int[] nums = {2, 3, 1, 1, 4};
        int out = s.jump(nums);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}