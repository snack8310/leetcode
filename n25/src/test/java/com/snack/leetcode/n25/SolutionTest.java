package com.snack.leetcode.n25;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void reverseKGroup() {
        String or = "12345";
        int k = 2;
        String ret = "21435";
        StringBuilder sb = getStringBuilder(or, k);
        Assert.assertEquals(ret, sb.toString());
    }

    @Test
    public void reverseKGroup1() {
        String or = "12345";
        int k = 3;
        String ret = "32145";
        StringBuilder sb = getStringBuilder(or, k);
        Assert.assertEquals(ret, sb.toString());
    }

    @Test
    public void reverseKGroup2() {
        String or = "12345";
        int k = 1;
        String ret = "12345";
        StringBuilder sb = getStringBuilder(or, k);
        Assert.assertEquals(ret, sb.toString());
    }

    @Test
    public void reverseKGroup3() {
        String or = "1";
        int k = 1;
        String ret = "1";
        StringBuilder sb = getStringBuilder(or, k);
        Assert.assertEquals(ret, sb.toString());
    }

    private StringBuilder getStringBuilder(String or, int k) {
        ListNode head = null;
        ListNode next = null;
        for (int i = or.length() - 1; i >= 0; i--) {
            next = head;
            head = new ListNode(or.charAt(i) - '0');
            head.next = next;
        }
        ListNode nL = s.reverseKGroup(head, k);
        StringBuilder sb = new StringBuilder();
        while (nL != null) {
            sb.append(nL.val);
            nL = nL.next;
        }
        return sb;
    }
}