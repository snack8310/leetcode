package com.snack.leetcode.n450;

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
    public void deleteNode() {
        Integer[] os = {5, 3, 6, 2, 4, null, 7};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.deleteNode(root, 3);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {5, 4, 6, 2, null, null, 7};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void deleteNode2() {
        Integer[] os = {5, 3, 6, 2, 4, null, 7};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.deleteNode(root, 0);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {5, 3, 6, 2, 4, null, 7};
        Assert.assertArrayEquals(expert, out);
    }


}