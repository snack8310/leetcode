package com.snack.leetcode.n1047;

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
    public void removeDuplicates() {
        String ds = "abbaca";
        Assert.assertEquals("ca", s.removeDuplicates(ds));
    }

    @Test
    public void removeDuplicates1() {
        String ds = "abbaabba";
        Assert.assertEquals("", s.removeDuplicates(ds));
    }

    @Test
    public void removeDuplicates2() {
        String ds = "abcddeecba";
        Assert.assertEquals("", s.removeDuplicates(ds));
    }
}