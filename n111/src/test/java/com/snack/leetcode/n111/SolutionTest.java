package com.snack.leetcode.n111;

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
    public void minDepth() {
        Integer[] root = {3, 9, 20, null, null, 15, 7};
        int out = s.minDepth(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        int expert = 2;
        Assert.assertEquals(expert, out);
    }

    @Test
    public void minDepth2() {
        Integer[] root = {2, null, 3, null, 4, null, 5, null, 6};
        int out = s.minDepth(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        int expert = 5;
        Assert.assertEquals(expert, out);
    }
}