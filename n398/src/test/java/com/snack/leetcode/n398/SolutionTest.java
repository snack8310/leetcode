package com.snack.leetcode.n398;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void pick() {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        Solution solution = new Solution(nums);
        print(solution, 3);
        print(solution, 1);
    }

    private void print(Solution solution, int K) {
        int max = 10;
        int i = 0;
        while (i < max) {
            System.out.println(solution.pick(K));
            i++;
        }
    }
}