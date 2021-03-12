package com.snack.leetcode.n331;

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
    public void isValidSerialization() {
        String input = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        Assert.assertTrue(s.isValidSerialization(input));
    }

    @Test
    public void isValidSerialization2() {
        String input = "1,#";
        Assert.assertFalse(s.isValidSerialization(input));
    }

    @Test
    public void isValidSerialization3() {
        String input = "9,#,#,1";
        Assert.assertFalse(s.isValidSerialization(input));
    }
}