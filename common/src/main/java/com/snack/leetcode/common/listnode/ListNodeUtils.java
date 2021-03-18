package com.snack.leetcode.common.listnode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListNodeUtils {

    public static ListNode toListNode(Integer[] os) {

        List<Integer> l = new LinkedList<>(Arrays.asList(os));
        return createListNode(l);
    }

    public static ListNode createListNode(List<Integer> l) {
        if (l.size() == 0) {
            return null;
        }
        ListNode listNode = new ListNode(l.get(0));
        l.remove(0);
        listNode.next = createListNode(l);
        return listNode;
    }

    public static Integer[] toArrays(ListNode node) {
        List<Integer> out = new LinkedList<>();
        while (node != null) {
            out.add(node.val);
            node = node.next;
        }
        return out.toArray(new Integer[out.size()]);
    }
}
