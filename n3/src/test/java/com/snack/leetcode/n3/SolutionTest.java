package com.snack.leetcode.n3;

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
    public void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        int out = solution.lengthOfLongestSubstring(s);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void lengthOfLongestSubstring2() {
        String s = "bbbbb";
        int out = solution.lengthOfLongestSubstring(s);
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void lengthOfLongestSubstring3() {
        String s = "pwwkew";
        int out = solution.lengthOfLongestSubstring(s);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void lengthOfLongestSubstring4() {
        String s = "";
        int out = solution.lengthOfLongestSubstring(s);
        int expert = 0;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void lengthOfLongestSubstring5() {
        String s = "au";
        int out = solution.lengthOfLongestSubstring(s);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

}
