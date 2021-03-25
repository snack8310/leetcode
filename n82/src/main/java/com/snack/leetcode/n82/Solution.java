package com.snack.leetcode.n82;

import com.snack.leetcode.common.listnode.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Deque<ListNode> queue = new LinkedList<>();
        ListNode last = null;
        while (head != null) {
            if (last == null) {
                queue.addLast(head);
                last = head;
                head = head.next;
                continue;
            }
            if (head.val == last.val) {
                if (!queue.isEmpty() && queue.getLast().val == head.val) {
                    queue.pollLast();
                    if (!queue.isEmpty()) {
                        queue.peekLast().next = null;
                    }
                }
            } else {
                if (!queue.isEmpty()) {
                    queue.peekLast().next = head;
                }
                queue.addLast(head);
            }
            last = head;
            head = head.next;
        }
        return queue.peekFirst();
    }
}
