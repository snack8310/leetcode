package com.snack.leetcode.n132;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void minCut() {
        String o = "aab";
        Assert.assertEquals(1, s.minCut(o));
    }

    @Test
    public void minCut2() {
        String o = "aabccbaa";
        Assert.assertEquals(0, s.minCut(o));
    }

    @Test
    public void minCut3() {
        String o = "ab";
        Assert.assertEquals(1, s.minCut(o));
    }

    @Test
    public void minCut4() {
        String o = "a";
        Assert.assertEquals(0, s.minCut(o));
    }

    @Test
    public void minCut5() {
        String o = "ababababababababababababcbabababababababababababa";
        Assert.assertEquals(0, s.minCut(o));
    }

}