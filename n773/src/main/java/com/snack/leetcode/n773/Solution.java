package com.snack.leetcode.n773;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    int[][] exchangeArray = new int[][]{
            {1, 3},
            {0, 2, 4},
            {1, 5},
            {0, 4},
            {1, 3, 5},
            {2, 4}
    };

    public String exchangeString(String string, int src, int dis) {
        char[] chars = string.toCharArray();
        char temp = chars[dis];
        chars[dis] = chars[src];
        chars[src] = temp;
        return new String(chars);
    }

    public int slidingPuzzle(int[][] board) {
        char[] chars = new char[6];
        int index = 0;
        for (int[] row : board) {
            for (int ch : row) {
                chars[index++] = (char) (ch + '0');
            }
        }
        String start = new String(chars);
        String target = "123450";
        return BFS(start, target);
    }

    private int BFS(String start, String target) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        q.offer(start);
        int step = 0;
        while (!q.isEmpty()) {
            int qz = q.size();
            for (int i = 0; i < qz; i++) {
                String cur = q.poll();
                if (cur.equals(target)) {
                    return step;
                }
                int position = cur.indexOf('0');
                int[] exchanges = exchangeArray[position];
                for (int next : exchanges) {
                    String s = exchangeString(cur, position, next);
                    if (!visited.contains(s)) {
                        q.offer(s);
                        visited.add(s);
                    }
                }

            }
            step++;
        }
        return -1;
    }
}
