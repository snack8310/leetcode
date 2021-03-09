package com.snack.leetcode.n1047;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
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