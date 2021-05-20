package com.snack.leetcode.n692;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void topKFrequent() {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> out = s.topKFrequent(words, k);
        String[] expected = {"i", "love"};
        Assert.assertArrayEquals(expected, out.toArray());
    }

    @Test
    public void topKFrequent2() {
        String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k = 4;
        List<String> out = s.topKFrequent(words, k);
        String[] expected = {"the", "is", "sunny", "day"};
        Assert.assertArrayEquals(expected, out.toArray());
    }
}