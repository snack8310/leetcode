package com.snack.leetcode.n776;

import com.snack.leetcode.common.treenode.TreeNode;
import com.snack.leetcode.common.treenode.TreeNodeUtils;
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

    }
}