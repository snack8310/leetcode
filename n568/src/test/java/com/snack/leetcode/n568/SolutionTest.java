package com.snack.leetcode.n568;

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
    public void evalRPN() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int out = s.evalRPN(tokens);
        int expert = 9;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void evalRPN2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int out = s.evalRPN(tokens);
        int expert = 6;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void evalRPN3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int out = s.evalRPN(tokens);
        int expert = 22;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void evalRPN4() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int out = s.evalRPN(tokens);
        int expert = 9;
        Assert.assertEquals(expert, out);
    }
}