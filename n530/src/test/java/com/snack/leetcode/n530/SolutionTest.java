package com.snack.leetcode.n530;

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
    public void getMinimumDifference() {
        Integer[] node = {1, null, 3, 2};
        int out = s.getMinimumDifference(TreeNodeUtils.toTreeNodeFromLevelOrder(node));
        int expert = 1;
        Assert.assertEquals(expert, out);
    }
}