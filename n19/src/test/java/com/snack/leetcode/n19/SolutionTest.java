package com.snack.leetcode.n19;

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
    public void removeNthFromEnd() {
        Integer[] head = {1, 2, 3, 4, 5};
        int n = 2;
        ListNode out = s.removeNthFromEnd(ListNodeUtils.toListNode(head), n);
        Integer[] expert = {1, 2, 3, 5};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void removeNthFromEnd2() {
        Integer[] head = {1};
        int n = 1;
        ListNode out = s.removeNthFromEnd(ListNodeUtils.toListNode(head), n);
        Integer[] expert = {};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }
}