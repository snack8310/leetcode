package com.snack.leetcode.n415;

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
    public void addStrings() {
        String num1 = "12";
        String num2 = "100";
        String out = solution.addStrings(num1, num2);
        String expected = "112";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void addStrings2() {
        String num1 = "0";
        String num2 = "0";
        String out = solution.addStrings(num1, num2);
        String expected = "0";
        Assert.assertEquals(expected, out);
    }
}