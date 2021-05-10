package com.snack.leetcode.n872;

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
    public void leafSimilar() {
        TreeNode root1 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
        TreeNode root2 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8});
        boolean out = s.leafSimilar(root1, root2);
        Assert.assertTrue(out);
    }

    @Test
    public void leafSimilar2() {
        TreeNode root1 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1});
        TreeNode root2 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1});
        boolean out = s.leafSimilar(root1, root2);
        Assert.assertTrue(out);
    }

    @Test
    public void leafSimilar3() {
        TreeNode root1 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1});
        TreeNode root2 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{2});
        boolean out = s.leafSimilar(root1, root2);
        Assert.assertFalse(out);
    }

    @Test
    public void leafSimilar4() {
        TreeNode root1 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1, 2});
        TreeNode root2 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{2, 2});
        boolean out = s.leafSimilar(root1, root2);
        Assert.assertTrue(out);
    }

    @Test
    public void leafSimilar5() {
        TreeNode root1 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1, 2, 3});
        TreeNode root2 = TreeNodeUtils.toTreeNodeFromLevelOrder(new Integer[]{1, 3, 2});
        boolean out = s.leafSimilar(root1, root2);
        Assert.assertFalse(out);
    }

}