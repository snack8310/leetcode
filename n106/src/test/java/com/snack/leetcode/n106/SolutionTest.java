package com.snack.leetcode.n106;

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
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = s.buildTree(inorder, postorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {3, 9, 20, 15, 7};
        Assert.assertArrayEquals(oot, output);
    }

    @Test
    public void buildTree2() {
        int[] inorder = {9, 3, 20, 15, 7, 16, 13, 14};
        int[] postorder = {9, 16, 14, 13, 7, 15, 20, 3};
        TreeNode root = s.buildTree(inorder, postorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {3, 9, 20, null, 15, null, 7, null, 13, 16, 14};
        Assert.assertArrayEquals(oot, output);
    }

    @Test
    public void buildTree3() {
        int[] inorder = {2, 3, 1};
        int[] postorder = {3, 2, 1};
        TreeNode root = s.buildTree(inorder, postorder);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {1, 2, null, null, 3};
        Assert.assertArrayEquals(oot, output);
    }
}