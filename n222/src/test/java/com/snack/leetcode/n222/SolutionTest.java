package com.snack.leetcode.n222;

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
    public void countNodes() {
        Integer[] input = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(input);
        int out = s.countNodes(root);
        Assert.assertEquals(6, out);
    }

    @Test
    public void countNodes2() {
        Integer[] input = {};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(input);
        int out = s.countNodes(root);
        Assert.assertEquals(0, out);
    }
}