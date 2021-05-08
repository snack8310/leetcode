package com.snack.leetcode.n1723;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void minimumTimeRequired() {
        int[] jobs = {3, 2, 3};
        int k = 3;
        int out = s.minimumTimeRequired(jobs, k);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void minimumTimeRequired2() {
        int[] jobs = {1, 2, 4, 7, 8};
        int k = 2;
        int out = s.minimumTimeRequired(jobs, k);
        int expected = 11;
        Assert.assertEquals(expected, out);
    }
}