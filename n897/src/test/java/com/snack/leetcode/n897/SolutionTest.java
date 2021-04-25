package com.snack.leetcode.n897;

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
    public void increasingBST() {
        Integer[] root = {5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9};
        TreeNode out = s.increasingBST(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        Integer[] expert = {1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9};
        Assert.assertArrayEquals(expert, TreeNodeUtils.createLevelOrderArrayFrom(out));
    }

    @Test
    public void increasingBST2() {
        Integer[] root = {5, 1, 7};
        TreeNode out = s.increasingBST(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        Integer[] expert = {1, null, 5, null, 7};
        Assert.assertArrayEquals(expert, TreeNodeUtils.createLevelOrderArrayFrom(out));
    }
}