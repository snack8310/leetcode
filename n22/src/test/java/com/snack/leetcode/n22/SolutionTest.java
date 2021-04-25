package com.snack.leetcode.n22;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void generateParenthesis() {
        int n = 3;
        List<String> out = s.generateParenthesis(n);
        int expert = 5;
        Assert.assertEquals(expert, out.size());
    }

    @Test
    public void generateParenthesis2() {
        int n = 1;
        List<String> out = s.generateParenthesis(n);
        int expert = 1;
        Assert.assertEquals(expert, out.size());
    }
}