package com.snack.leetcode.n354;

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
    public void maxEnvelopes() {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        int out = s.maxEnvelopes(envelopes);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void maxEnvelopes2() {
        int[][] envelopes = {{1, 1}, {1, 1}, {1, 1}};
        int out = s.maxEnvelopes(envelopes);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}