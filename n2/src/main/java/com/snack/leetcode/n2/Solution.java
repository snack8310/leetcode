package com.snack.leetcode.n2;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.val == 0 && l1.next == null && l2.val == 0 && l2.next == null) {
            return new ListNode(0);
        }
        ListNode ret, c;
        ret = c = new ListNode();
        int makeup = 0;
        while (l1 != null || l2 != null) {
            int l1v = l1 == null ? 0 : l1.val;
            int l2v = l2 == null ? 0 : l2.val;
            c.next = new ListNode((l1v + l2v + makeup) % 10);
            c = c.next;
            makeup = (l1v + l2v + makeup) / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (makeup == 1) {
            c.next = new ListNode(makeup);
        }
        return ret.next;
    }
}
