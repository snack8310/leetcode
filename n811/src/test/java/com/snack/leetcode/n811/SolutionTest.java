package com.snack.leetcode.n811;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void subdomainVisits() {
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        List<String> out = solution.subdomainVisits(cpdomains);
        String[] expected = {"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"};
        Assert.assertArrayEquals(expected, out.toArray());
    }
}