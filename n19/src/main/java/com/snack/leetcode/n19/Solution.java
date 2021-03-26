package com.snack.leetcode.n19;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p, q;
        p = q = dummyHead;
        int i = 0;
        while (i < n + 1) {
            q = q.next;
            i++;
        }
        while (q != null) {
            q = q.next;
            p = p.next;
        }
        p.next = p.next.next;
        return dummyHead.next;
    }
}
