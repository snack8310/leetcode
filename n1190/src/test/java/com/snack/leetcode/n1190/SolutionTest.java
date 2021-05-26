package com.snack.leetcode.n1190;

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
    public void reverseParentheses() {
        String s = "(abcd)";
        String out = solution.reverseParentheses(s);
        String expected = "dcba";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void reverseParentheses2() {
        String s = "(u(love)i)";
        String out = solution.reverseParentheses(s);
        String expected = "iloveu";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void reverseParentheses3() {
        String s = "(ed(et(oc))el)";
        String out = solution.reverseParentheses(s);
        String expected = "leetcode";
        Assert.assertEquals(expected, out);
    }

    @Test
    public void reverseParentheses4() {
        String s = "a(bcdefghijkl(mno)p)q";
        String out = solution.reverseParentheses(s);
        String expected = "apmnolkjihgfedcbq";
        Assert.assertEquals(expected, out);
    }
}