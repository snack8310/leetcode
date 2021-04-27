package com.snack.leetcode.n938;

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
    public void rangeSumBST() {
        Integer[] root = {10, 5, 15, 3, 7, null, 18};
        int low = 7;
        int high = 15;
        int out = s.rangeSumBST(TreeNodeUtils.toTreeNodeFromLevelOrder(root), low, high);
        int expert = 32;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void rangeSumBST2() {
        Integer[] root = {10, 5, 15, 3, 7, 13, 18, 1, null, 6};
        int low = 6;
        int high = 10;
        int out = s.rangeSumBST(TreeNodeUtils.toTreeNodeFromLevelOrder(root), low, high);
        int expert = 23;
        Assert.assertEquals(expert, out);
    }
}