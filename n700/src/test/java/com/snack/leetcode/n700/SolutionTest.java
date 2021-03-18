package com.snack.leetcode.n700;

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
    public void searchBST() {
        Integer[] os = {4, 2, 7, 1, 3};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.searchBST(root, 2);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {2, 1, 3};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void searchBST2() {
        Integer[] os = {4, 2, 7, 1, 3};
        TreeNode root = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.searchBST(root, 5);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Assert.assertNull(out);
    }
}