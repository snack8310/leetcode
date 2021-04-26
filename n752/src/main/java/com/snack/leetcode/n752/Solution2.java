package com.snack.leetcode.n752;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int openLock(String[] deadends, String target) {
        Set<String> deads = new HashSet<>();
        for (String s : deadends) {
            deads.add(s);
        }
        return BFS("0000", target, deads);
    }

    int BFS(String start, String target, Set<String> deads) {
        Set<String> q1 = new HashSet<>();
        Set<String> q2 = new HashSet<>();
        Set<String> visited = new HashSet<>(); // 避免走回头路

        q1.add(start);
        q2.add(target);
        visited.add(start);
        int step = 0; // 记录扩散的步数

        while (!q1.isEmpty() && !q2.isEmpty()) {
            Set<String> temp = new HashSet<>();
            /* 将当前队列中的所有节点向四周扩散 */
            for (String cur : q1) {
                if (deads.contains(cur)) {
                    continue;
                }
                /* 划重点：这里判断是否到达终点 */
                if (q2.contains(cur)) {
                    return step;
                }
                visited.add(cur);
                /* 将 cur 的相邻节点加入队列 */
                for (int j = 0; j < 4; j++) {
                    String up = plusOne(cur, j);
                    if (!visited.contains(up)) {
                        temp.add(up);
                    }
                    String down = minusOne(cur, j);
                    if (!visited.contains(down)) {
                        temp.add(down);
                    }
                }
            }
            /* 划重点：更新步数在这里 */
            step++;
            q1 = q2;
            q2 = temp;
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
