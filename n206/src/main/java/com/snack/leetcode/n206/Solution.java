package com.snack.leetcode.n206;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode c = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return c;
    }
}
