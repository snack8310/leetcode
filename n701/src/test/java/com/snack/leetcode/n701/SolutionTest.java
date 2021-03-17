package com.snack.leetcode.n701;

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
    public void insertIntoBST() {
        Integer[] os = {4, 2, 7, 1, 3};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.insertIntoBST(root, 5);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {4, 2, 7, 1, 3, 5};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void insertIntoBST2() {
        Integer[] os = {40,20,60,10,30,50,70};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.insertIntoBST(root, 25);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {40,20,60,10,30,50,70,null,null,25};
        Assert.assertArrayEquals(expert, out);
    }

    @Test
    public void insertIntoBST3() {
        Integer[] os = {4,2,7,1,3,null,null,null,null,null,null};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.insertIntoBST(root, 5);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {4,2,7,1,3,5};
        Assert.assertArrayEquals(expert, out);
    }
}