package com.snack.leetcode.n382;

import com.snack.leetcode.common.listnode.ListNode;

import java.util.Random;

public class Solution {
    ListNode head;

    /**
     * @param head The linked list's head.
     *             Note that the head is guaranteed to be not null, so it contains at least one node.
     */
    public Solution(ListNode head) {
        this.head = head;
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        Random random = new Random();
        ListNode cur = head;
        int reserve = 0;
        int index = 0;
        while (cur != null) {
            if (random.nextInt(++index) == 0) {
                reserve = cur.val;
            }
            cur = cur.next;
        }
        return reserve;
    }
}
