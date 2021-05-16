package com.snack.leetcode.n1258;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void generateSentences() {
        String[][] aaa = {{"happy", "joy"}, {"sad", "sorrow"}, {"joy", "cheerful"}};
        List<String[]> ll = Arrays.asList(aaa);
        List<List<String>> synonyms = new ArrayList<>();
        for (String[] l : ll) {
            synonyms.add(Arrays.asList(l));
        }
        String text = "I am happy today but was sad yesterday";
        List<String> out = s.generateSentences(synonyms, text);
        String[] expected = {"I am cheerful today but was sad yesterday",
                "I am cheerful today but was sorrow yesterday",
                "I am happy today but was sad yesterday",
                "I am happy today but was sorrow yesterday",
                "I am joy today but was sad yesterday",
                "I am joy today but was sorrow yesterday"};
        Assert.assertArrayEquals(expected, out.toArray());
    }

    @Test
    public void generateSentences2() {
        String[][] aaa = {{"v", "yr"}};
        List<String[]> ll = Arrays.asList(aaa);
        List<List<String>> synonyms = new ArrayList<>();
        for (String[] l : ll) {
            synonyms.add(Arrays.asList(l));
        }
        String text = "v v v v yZ";
        List<String> out = s.generateSentences(synonyms, text);
        String[] expected = {"v v v v yZ", "v v v yr yZ", "v v yr v yZ", "v v yr yr yZ", "v yr v v yZ", "v yr v yr yZ", "v yr yr v yZ", "v yr yr yr yZ", "yr v v v yZ", "yr v v yr yZ", "yr v yr v yZ", "yr v yr yr yZ", "yr yr v v yZ", "yr yr v yr yZ", "yr yr yr v yZ", "yr yr yr yr yZ"};
        Assert.assertArrayEquals(expected, out.toArray());
    }
}