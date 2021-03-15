package com.snack.leetcode.n105;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void buildTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = s.buildTree(preorder, inorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {3, 9, 20, 15, 7};
        Assert.assertArrayEquals(oot, output);
    }

    @Test
    public void buildTree2() {
        int[] preorder = {3, 9, 20, 15, 7, 13, 16, 14};
        int[] inorder = {9, 3, 15, 20, 7, 16, 13, 14};
        TreeNode root = s.buildTree(preorder, inorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {3, 9, 20, 15, 7, 13, 15, 14};
        Assert.assertArrayEquals(oot, output);
    }
}