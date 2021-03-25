package com.snack.leetcode.n142;

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
    public void detectCycle() {
        Integer[] input = {3, 2, 0, -4};
        ListNode head = ListNodeUtils.toListNode(input);
        head.next.next.next.next = head.next;
        Assert.assertEquals(2, s.detectCycle(head).val);
    }

    @Test
    public void detectCycle2() {
        Integer[] input = {1, 2};
        ListNode head = ListNodeUtils.toListNode(input);
        head.next.next = head;
        Assert.assertEquals(1, s.detectCycle(head).val);
    }
}