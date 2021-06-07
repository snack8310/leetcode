package com.snack.leetcode.n124;

import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void maxPathSum() {
        Integer[] root = {1, 2, 3};
        int out = solution.maxPathSum(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        int expected = 6;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void maxPathSum2() {
        Integer[] root = {-10, 9, 20, null, null, 15, 7};
        int out = solution.maxPathSum(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
        int expected = 42;
        Assert.assertEquals(expected, out);
    }
}