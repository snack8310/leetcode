package com.snack.leetcode.n92;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void reverseBetween() {
        Integer[] in = {1, 2, 3, 4, 5};
        ListNode root = ListNodeUtils.toListNode(in);
        ListNode nL = s.reverseBetween(root, 2, 4);
        Integer[] out = ListNodeUtils.toArrays(nL);
        Integer[] expert = {1, 4, 3, 2, 5};
    }
}