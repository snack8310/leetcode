package com.snack.leetcode.n230;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution2Test {

    private Solution2 s;

    @Before
    public void setUp() throws Exception {
        s = new Solution2();
    }

    @Test
    public void kthSmallest() {
        Integer[] os = {3, 1, 4, null, 2};
        int k = 1;
        TreeNode treeNode = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        int out = s.kthSmallest(treeNode, k);
        Assert.assertEquals(1, out);
    }

    @Test
    public void kthSmallest2() {
        Integer[] os = {5, 3, 6, 2, 4, null, null, 1};
        int k = 3;
        TreeNode treeNode = TreeNodeUtils.toTreeNodeFromLevelOrder(os);
        int out = s.kthSmallest(treeNode, k);
        Assert.assertEquals(3, out);
    }
}