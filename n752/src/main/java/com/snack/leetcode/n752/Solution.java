package com.snack.leetcode.n752;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        for (String s : deadends) {
            deads.add(s);
        }
        return BFS("0000", target, deads);
    }

    int BFS(String start, String target, Set<String> deads) {
        Queue<String> q = new LinkedList<>(); // 核心数据结构
        Set<String> visited = new HashSet<>(); // 避免走回头路

        q.offer(start); // 将起点加入队列
        visited.add(start);
        int step = 0; // 记录扩散的步数

        while (!q.isEmpty()) {
            int sz = q.size();
            /* 将当前队列中的所有节点向四周扩散 */
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                if (deads.contains(cur)) {
                    continue;
                }
                /* 划重点：这里判断是否到达终点 */
                if (cur.equals(target)) {
                    return step;
                }
                /* 将 cur 的相邻节点加入队列 */
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        q.offer(up);
                        visited.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        q.offer(down);
                        visited.add(down);
                    }
                }
            }
            /* 划重点：更新步数在这里 */
            step++;
        }
        return -1;
    }

    private String minusOne(String cur, int j) {
        char[] ch = cur.toCharArray();
        if (ch[j] == '9')
            ch[j] = '0';
        else
            ch[j] += 1;
        return new String(ch);
    }

    private String plusOne(String cur, int j) {
        char[] ch = cur.toCharArray();
        if (ch[j] == '0')
            ch[j] = '9';
        else
            ch[j] -= 1;
        return new String(ch);
    }
}
