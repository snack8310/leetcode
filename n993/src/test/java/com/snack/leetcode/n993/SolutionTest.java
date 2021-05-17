package com.snack.leetcode.n993;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
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
    public void isCousins() {
        Integer[] root = {1, 2, 3, 4};
        boolean out = s.isCousins(TreeNodeUtils.toTreeNodeFromLevelOrder(root), 4, 3);
        Assert.assertFalse(out);
    }

    @Test
    public void isCousins2() {
        Integer[] root = {1, 2, 3, null, 4, null, 5};
        boolean out = s.isCousins(TreeNodeUtils.toTreeNodeFromLevelOrder(root), 5, 4);
        Assert.assertTrue(out);
    }

    @Test
    public void isCousins3() {
        Integer[] root = {1, 2, 3, null, 4};
        boolean out = s.isCousins(TreeNodeUtils.toTreeNodeFromLevelOrder(root), 2, 3);
        Assert.assertFalse(out);
    }
}