package com.snack.leetcode.o22;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
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
    public void getKthFromEnd() {
        Integer[] head = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode out = solution.getKthFromEnd(ListNodeUtils.toListNode(head), k);
        Integer[] expected = {4, 5};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }
}