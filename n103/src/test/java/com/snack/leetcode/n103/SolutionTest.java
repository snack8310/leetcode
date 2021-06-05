package com.snack.leetcode.n103;

import com.snack.leetcode.common.treenode.TreeNodeUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void zigzagLevelOrder() {
        Integer[] root = {3, 9, 20, null, null, 15, 7};
        List<List<Integer>> out = solution.zigzagLevelOrder(TreeNodeUtils.toTreeNodeFromLevelOrder(root));
    }
}