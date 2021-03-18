package com.snack.leetcode.n98;

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
    public void isValidBST() {
        Integer[] os = {5, 1, 4, null, null, 3, 6};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        boolean out = s.isValidBST(root);
        Assert.assertFalse(out);
    }

    @Test
    public void isValidBST2() {
        Integer[] os = {1, 1};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        boolean out = s.isValidBST(root);
        Assert.assertFalse(out);
    }

    @Test
    public void isValidBST3() {
        Integer[] os = {5, 4, 6, null, null, 3, 7};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        boolean out = s.isValidBST(root);
        Assert.assertFalse(out);
    }
}