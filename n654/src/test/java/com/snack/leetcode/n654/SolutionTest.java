package com.snack.leetcode.n654;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();

    }

    @Test
    public void constructMaximumBinaryTree() {
        int[] input = {3, 2, 1, 6, 0, 5};
        TreeNode root = solution.constructMaximumBinaryTree(input);
        Integer[] output = TreeNodeUtils.createLevelOrderArrayFrom(root);
        Integer[] oot = {6, 3, 5, null, 2, 0, null, null, 1};
        Assert.assertArrayEquals(oot, output);

    }
}