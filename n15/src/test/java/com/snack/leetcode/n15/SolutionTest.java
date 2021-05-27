package com.snack.leetcode.n15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void threeSum() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> out = s.threeSum(nums);
        Integer[][] expected = {{-1, -1, 2}, {-1, 0, 1}};
        doAssert(expected, out);
    }

    private void doAssert(Integer[][] expected, List<List<Integer>> out) {
        for (int i = 0; i < out.size(); i++) {
            Integer[] item = out.get(i).toArray(new Integer[out.get(i).size()]);
            Assert.assertArrayEquals(expected[i], item);
        }
    }
}