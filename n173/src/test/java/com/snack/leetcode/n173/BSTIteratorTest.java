package com.snack.leetcode.n173;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTIteratorTest {

    TreeNode treeNode;

    @Before
    public void setUp() throws Exception {
        Integer[] head = {7, 3, 15, null, null, 9, 20};
        treeNode = TreeNodeUtils.toTreeNodeFromLevelOrder(head);
    }

    @Test
    public void next() {
        BSTIterator bstIterator = new BSTIterator(treeNode);
        Assert.assertEquals(3, bstIterator.next());
        Assert.assertEquals(7, bstIterator.next());
    }

    @Test
    public void hasNext() {
        BSTIterator bstIterator = new BSTIterator(treeNode);
        Assert.assertEquals(3, bstIterator.next());
        Assert.assertEquals(7, bstIterator.next());
        Assert.assertTrue(bstIterator.hasNext());
    }
}