package com.snack.leetcode.n567;

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
    public void checkInclusion() {
        String s1 = "ab" ;
        String s2 = "eidbaooo";
        Assert.assertTrue(s.checkInclusion(s1,s2));
    }

    @Test
    public void checkInclusion2() {
        String s1 = "ab" ;
        String s2 = "eidboaoo";
        Assert.assertFalse(s.checkInclusion(s1,s2));
    }

    @Test
    public void checkInclusion3() {
        String s1 = "adc" ;
        String s2 = "dcda";
        Assert.assertTrue(s.checkInclusion(s1,s2));
    }

    @Test
    public void checkInclusion4() {
        String s1 = "a" ;
        String s2 = "b";
        Assert.assertFalse(s.checkInclusion(s1,s2));
    }

    @Test
    public void checkInclusion5() {
        String s1 = "ab" ;
        String s2 = "ab";
        Assert.assertTrue(s.checkInclusion(s1,s2));
    }

    @Test
    public void checkInclusion6() {
        String s1 = "ab" ;
        String s2 = "a";
        Assert.assertFalse(s.checkInclusion(s1,s2));
    }

}