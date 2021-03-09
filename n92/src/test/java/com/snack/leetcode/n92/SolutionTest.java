package com.snack.leetcode.n92;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void reverseBetween() {
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);
        ListNode nL = s.reverseBetween(ln1, 2, 4);
        StringBuilder sb = new StringBuilder();
        while (nL != null) {
            sb.append(nL.val);
            nL = nL.next;
        }
        Assert.assertEquals("14325", sb.toString());
    }
}