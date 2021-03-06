package com.snack.leetcode.n781;

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
    public void numRabbits() {
        int[] answers = {1, 1, 2};
        int out = s.numRabbits(answers);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numRabbits2() {
        int[] answers = {10, 10, 10};
        int out = s.numRabbits(answers);
        int expert = 11;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void numRabbits3() {
        int[] answers = {};
        int out = s.numRabbits(answers);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }
}