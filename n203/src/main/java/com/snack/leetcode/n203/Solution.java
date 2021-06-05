package com.snack.leetcode.n203;

import com.snack.leetcode.common.listnode.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while (head != null) {
            if (head.val == val) {
                head = head.next;
                continue;
            }
            ListNode next = head.next;
            head.next = null;
            cur.next = head;
            cur = cur.next;
            head = next;
        }
        return ans.next;
    }
}
