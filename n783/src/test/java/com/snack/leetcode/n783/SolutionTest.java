package com.snack.leetcode.n783;

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
    public void minDiffInBST() {
        Integer[] node = {4, 2, 6, 1, 3};
        int out = s.minDiffInBST(TreeNodeUtils.toTreeNodeFromLevelOrder(node));
        int expert = 1;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minDiffInBST2() {
        Integer[] node = {1, 0, 48, null, null, 12, 49};
        int out = s.minDiffInBST(TreeNodeUtils.toTreeNodeFromLevelOrder(node));
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}