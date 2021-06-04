package com.snack.leetcode.n160;

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
    public void getIntersectionNode() {
        Integer[] headA = {4, 1, 8, 4, 5};
        Integer[] headB = {5, 0, 1, 8, 4, 5};
        ListNode out = solution.getIntersectionNode(ListNodeUtils.toListNode(headA), ListNodeUtils.toListNode(headB));
        Integer[] expected = {8, 4, 5};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void getIntersectionNode2() {
        Integer[] headA = {0, 9, 1, 2, 4};
        Integer[] headB = {3, 2, 4};
        ListNode out = solution.getIntersectionNode(ListNodeUtils.toListNode(headA), ListNodeUtils.toListNode(headB));
        Integer[] expected = {2, 4};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }
}