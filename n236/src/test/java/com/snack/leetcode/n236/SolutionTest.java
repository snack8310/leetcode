package com.snack.leetcode.n236;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void lowestCommonAncestor() {
        Integer[] input = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(input);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode treeNode = s.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(3, treeNode.val);

    }
}