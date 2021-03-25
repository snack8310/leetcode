package com.snack.leetcode.n82;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void deleteDuplicates() {
        Integer[] head = {1, 2, 3, 3, 4, 4, 5};
        ListNode out = s.deleteDuplicates(ListNodeUtils.toListNode(head));
        Integer[] expert = {1, 2, 5};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void deleteDuplicates2() {
        Integer[] head = {1, 1, 1, 2, 3};
        ListNode out = s.deleteDuplicates(ListNodeUtils.toListNode(head));
        Integer[] expert = {2, 3};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void deleteDuplicates3() {
        Integer[] head = {1, 2, 2};
        ListNode out = s.deleteDuplicates(ListNodeUtils.toListNode(head));
        Integer[] expert = {1};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }
}