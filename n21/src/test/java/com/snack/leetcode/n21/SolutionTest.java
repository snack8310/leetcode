package com.snack.leetcode.n21;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void mergeTwoLists() {
        Integer[] l1 = {1, 2, 4};
        Integer[] l2 = {1, 3, 4};
        ListNode out = solution.mergeTwoLists(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {1, 1, 2, 3, 4, 4};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void mergeTwoLists2() {
        Integer[] l1 = {};
        Integer[] l2 = {};
        ListNode out = solution.mergeTwoLists(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void mergeTwoLists3() {
        Integer[] l1 = {};
        Integer[] l2 = {0};
        ListNode out = solution.mergeTwoLists(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {0};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }
}