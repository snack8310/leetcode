package com.snack.leetcode.n583;

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
    public void minDistance() {
        String word1 = "sea";
        String word2 = "eat";
        int out = s.minDistance(word1, word2);
        int expert = 2;
        Assert.assertEquals(expert, out);
    }
}