package com.snack.leetcode.n382;

import com.snack.leetcode.common.listnode.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRandom() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        Solution solution = new Solution(head);

        int out = solution.getRandom();
        int[] expected = {1, 2, 3};
        assertRandom(expected, out);
    }

    private void assertRandom(int[] expected, int actual) {
        for (int e : expected) {
            if (actual == e) {
                return;
            }
        }
        throw new ComparisonFailure("not in", String.valueOf(expected), String.valueOf(actual));
    }
}