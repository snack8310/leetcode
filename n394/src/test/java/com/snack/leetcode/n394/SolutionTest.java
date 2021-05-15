package com.snack.leetcode.n394;

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
    public void decodeString() {
        String s = "3[a]2[bc]";
        String out = solution.decodeString(s);
        String expected = "aaabcbc";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void decodeString2() {
        String s = "3[a2[c]]";
        String out = solution.decodeString(s);
        String expected = "accaccacc";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void decodeString3() {
        String s = "2[abc]3[cd]ef";
        String out = solution.decodeString(s);
        String expected = "abcabccdcdcdef";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void decodeString4() {
        String s = "abc3[cd]xyz";
        String out = solution.decodeString(s);
        String expected = "abccdcdcdxyz";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void decodeString5() {
        String s = "100[leetcode]";
        String out = solution.decodeString(s);
        String expected = "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void decodeString6() {
        String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        String out = solution.decodeString(s);
        String expected = "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef";
        Assert.assertEquals(expected, out);
    }
}