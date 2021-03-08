package com.snack.leetcode.n132;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
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

    @Test
    public void minCut7() {
        String o = "ababababababababababababcbabababababababababababaababababababababababababcbabababababababababababaababababababababababababcbabababababababababababaababababababababababababcbabababababababababababa";
        Assert.assertEquals(0, s.minCut(o));
    }


    @Test
    public void minCut6() {
        String o = "aaabaa";
        Assert.assertEquals(1, s.minCut(o));
    }
}