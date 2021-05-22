package com.snack.leetcode.n206;

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
    public void reverseList() {
        Integer[] head = {1, 2, 3, 4, 5};
        ListNode out = s.reverseList(ListNodeUtils.toListNode(head));
        Integer[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void reverseList2() {
        Integer[] head = {1, 2};
        ListNode out = s.reverseList(ListNodeUtils.toListNode(head));
        Integer[] expected = {2, 1};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void reverseList3() {
        Integer[] head = {};
        ListNode out = s.reverseList(ListNodeUtils.toListNode(head));
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

}