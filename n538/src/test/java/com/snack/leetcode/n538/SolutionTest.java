package com.snack.leetcode.n538;

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
    public void convertBST() {
        Integer[] os = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.convertBST(root);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void convertBST2() {
        Integer[] os = {0, null, 1};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.convertBST(root);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {1, null, 1};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void convertBST3() {
        Integer[] os = {1, 0, 2};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.convertBST(root);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {3, 3, 2};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void convertBST4() {
        Integer[] os = {3, 2, 4, 1};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.convertBST(root);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {7, 9, 4, 10};
        Assert.assertArrayEquals(expert, out);
    }
}