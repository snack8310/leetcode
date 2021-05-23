package com.snack.leetcode.n20;

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
    public void isValid() {
        String s = "()";
        boolean out = solution.isValid(s);
        Assert.assertTrue(out);
    }

    @Test
    public void isValid2() {
        String s = "()[]{}";
        boolean out = solution.isValid(s);
        Assert.assertTrue(out);
    }

    @Test
    public void isValid3() {
        String s = "(]";
        boolean out = solution.isValid(s);
        Assert.assertFalse(out);
    }

    @Test
    public void isValid4() {
        String s = "([)]";
        boolean out = solution.isValid(s);
        Assert.assertFalse(out);
    }

    @Test
    public void isValid5() {
        String s = "[";
        boolean out = solution.isValid(s);
        Assert.assertFalse(out);
    }
}