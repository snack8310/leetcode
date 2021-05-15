package com.snack.leetcode.n776;

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
    public void splitBST() {
        Integer[] root = {4, 2, 6, 1, 3, 5, 7};
        TreeNode[] out = s.splitBST(TreeNodeUtils.toTreeNodeFromLevelOrder(root), 2);
        Integer[] expected1 = {2, 1};
        Integer[] expected2 = {4, 3, 6, null, null, 5, 7};
        Assert.assertEquals(2, out.length);
        Assert.assertArrayEquals(expected1, TreeNodeUtils.createLevelOrderArrayFrom(out[0]));
        Assert.assertArrayEquals(expected2, TreeNodeUtils.createLevelOrderArrayFrom(out[1]));
    }
}