package com.snack.leetcode.n111;

import com.snack.leetcode.common.treenode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return BFS(root);
    }

    int BFS(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>(); // 核心数据结 构
        q.offer(root); // 将起点加入队列
        int step = 1; // 记录扩散的步数

        while (!q.isEmpty()) {
            int sz = q.size();
            /* 将当前队列中的所有节点向四周扩散 */
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                /* 划重点：这里判断是否到达终点 */
                if (cur.left == null && cur.right == null) {
                    return step;
                }
                /* 将 cur 的相邻节点加入队列 */
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
            /* 划重点：更新步数在这里 */
            step++;
        }
        return step;
    }
}
