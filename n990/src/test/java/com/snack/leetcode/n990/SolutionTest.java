package com.snack.leetcode.n990;

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
    public void equationsPossible() {
        String[] equations = {"a==b", "b!=a"};
        Assert.assertFalse(s.equationsPossible(equations));
    }

    @Test
    public void equationsPossible2() {
        String[] equations = {"b==a", "a==b"};
        Assert.assertTrue(s.equationsPossible(equations));
    }

    @Test
    public void equationsPossible3() {
        String[] equations = {"a==b", "b==c", "a==c"};
        Assert.assertTrue(s.equationsPossible(equations));
    }

    @Test
    public void equationsPossible4() {
        String[] equations = {"a==b", "b!=c", "c==a"};
        Assert.assertFalse(s.equationsPossible(equations));
    }
}