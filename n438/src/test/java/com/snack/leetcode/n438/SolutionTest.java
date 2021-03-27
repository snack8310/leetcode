package com.snack.leetcode.n438;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void findAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> out = solution.findAnagrams(s, p);
        Integer[] expert = {0, 6};
        Assert.assertArrayEquals(expert, out.toArray(new Integer[out.size()]));
    }

    @Test
    public void findAnagrams2() {
        String s = "abab";
        String p = "ab";
        List<Integer> out = solution.findAnagrams(s, p);
        Integer[] expert = {0, 1, 2};
        Assert.assertArrayEquals(expert, out.toArray(new Integer[out.size()]));
    }

    @Test
    public void findAnagrams3() {
        String s = "aa";
        String p = "bb";
        List<Integer> out = solution.findAnagrams(s, p);
        Integer[] expert = {};
        Assert.assertArrayEquals(expert, out.toArray(new Integer[out.size()]));
    }

    @Test
    public void findAnagrams4() {
        String s = "";
        String p = "a";
        List<Integer> out = solution.findAnagrams(s, p);
        Integer[] expert = {};
        Assert.assertArrayEquals(expert, out.toArray(new Integer[out.size()]));
    }

    @Test
    public void findAnagrams5() {
        String s = "aaaaaaaaaa";
        String p = "aaaaaaaaaaaaa";
        List<Integer> out = solution.findAnagrams(s, p);
        Integer[] expert = {};
        Assert.assertArrayEquals(expert, out.toArray(new Integer[out.size()]));
    }

}