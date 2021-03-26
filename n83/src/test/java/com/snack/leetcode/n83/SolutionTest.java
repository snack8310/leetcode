package com.snack.leetcode.n83;

import com.snack.leetcode.common.listnode.ListNode;
import com.snack.leetcode.common.listnode.ListNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void deleteDuplicates() {
        Integer[] head = {1, 1, 2};
        ListNode out = s.deleteDuplicates(ListNodeUtils.toListNode(head));
        Integer[] expert = {1, 2};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }
}