package com.snack.leetcode.n143;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void reorderList() {
        Integer[] input = {1, 2, 3, 4};
        ListNode head = ListNodeUtils.toListNode(input);
        s.reorderList(head);
        Integer[] expected = {1, 4, 2, 3};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(head));
    }

    @Test
    public void reorderList2() {
        Integer[] input = {1, 2, 3, 4, 5};
        ListNode head = ListNodeUtils.toListNode(input);
        s.reorderList(head);
        Integer[] expected = {1, 5, 2, 4, 3};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(head));
    }
}