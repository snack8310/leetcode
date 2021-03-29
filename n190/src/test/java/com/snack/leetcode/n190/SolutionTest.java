package com.snack.leetcode.n190;

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
    public void reverseBits() {
        int n = 0b00000010100101000001111010011100;
        int out = solution.reverseBits(n);
        int expert = 0b00111001011110000010100101000000;
        Assert.assertEquals(expert, out);
    }
}