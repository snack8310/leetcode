package com.snack.leetcode.n2;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
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
    public void addTwoNumbers() {
        Integer[] l1 = {2, 4, 3};
        Integer[] l2 = {5, 6, 4};
        ListNode out = s.addTwoNumbers(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {7, 0, 8};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void addTwoNumbers2() {
        Integer[] l1 = {0};
        Integer[] l2 = {0};
        ListNode out = s.addTwoNumbers(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {0};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void addTwoNumbers3() {
        Integer[] l1 = {9, 9, 9, 9, 9, 9, 9};
        Integer[] l2 = {9, 9, 9, 9};
        ListNode out = s.addTwoNumbers(ListNodeUtils.toListNode(l1), ListNodeUtils.toListNode(l2));
        Integer[] expected = {8, 9, 9, 9, 0, 0, 0, 1};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }
}