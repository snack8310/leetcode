package com.snack.leetcode.n203;

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
    public void removeElements() {
        Integer[] head = {1, 2, 6, 3, 4, 5, 6};
        int val = 6;
        ListNode out = solution.removeElements(ListNodeUtils.toListNode(head), val);
        Integer[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void removeElements2() {
        Integer[] head = {};
        int val = 1;
        ListNode out = solution.removeElements(ListNodeUtils.toListNode(head), val);
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }

    @Test
    public void removeElements3() {
        Integer[] head = {7, 7, 7, 7};
        int val = 7;
        ListNode out = solution.removeElements(ListNodeUtils.toListNode(head), val);
        Integer[] expected = {};
        Assert.assertArrayEquals(expected, ListNodeUtils.toArrays(out));
    }
}