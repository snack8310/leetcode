package com.snack.leetcode.n1038;

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
    public void bstToGst() {

        Integer[] os = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
        TreeNode root = TreeNodeUtils.createTreeNodeFromLevelOrder(os);
        TreeNode outTree = s.bstToGst(root);
        Integer[] out = TreeNodeUtils.createLevelOrderArrayFrom(outTree);
        Integer[] expert = {30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8};
        Assert.assertArrayEquals(expert, out);
    }
}