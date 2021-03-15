package com.snack.leetcode.n105;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
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
        int[] inorder = {9, 3, 20, 15, 7, 16, 13, 14};
        TreeNode root = s.buildTree(preorder, inorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {3, 9, 20, null, 15, null, 7, null, 13, 16, 14};
        Assert.assertArrayEquals(oot, output);
    }

    @Test
    public void buildTree3() {
        int[] preorder = {1, 2, 3};
        int[] inorder = {2, 3, 1};
        TreeNode root = s.buildTree(preorder, inorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {1, 2, null, null, 3};
        Assert.assertArrayEquals(oot, output);
    }

}