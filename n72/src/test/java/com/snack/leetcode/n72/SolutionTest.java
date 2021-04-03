package com.snack.leetcode.n72;

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
        String word1 = "horse";
        String word2 = "ros";
        int out = s.minDistance(word1, word2);
        int expert = 3;
        Assert.assertEquals(expert, out);
    }


    @Test
    public void minDistance2() {
        String word1 = "intention";
        String word2 = "execution";
        int out = s.minDistance(word1, word2);
        int expert = 5;
        Assert.assertEquals(expert, out);
    }
}