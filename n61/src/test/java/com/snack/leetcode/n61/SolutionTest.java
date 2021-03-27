package com.snack.leetcode.n61;

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
    public void rotateRight() {
        Integer[] head = {1, 2, 3, 4, 5};
        int k = 2;
        ListNode out = s.rotateRight(ListNodeUtils.toListNode(head), k);
        Integer[] expert = {4, 5, 1, 2, 3};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void rotateRight2() {
        Integer[] head = {0, 1, 2};
        int k = 4;
        ListNode out = s.rotateRight(ListNodeUtils.toListNode(head), k);
        Integer[] expert = {2, 0, 1};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void rotateRight3() {
        Integer[] head = {};
        int k = 0;
        ListNode out = s.rotateRight(ListNodeUtils.toListNode(head), k);
        Integer[] expert = {};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

    @Test
    public void rotateRight4() {
        Integer[] head = {1};
        int k = 1;
        ListNode out = s.rotateRight(ListNodeUtils.toListNode(head), k);
        Integer[] expert = {1};
        Assert.assertArrayEquals(expert, ListNodeUtils.toArrays(out));
    }

}