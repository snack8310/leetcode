package com.snack.leetcode.n200;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<String, Boolean> visited = new HashMap<>();

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') {
                    continue;
                }
                if (visited.containsKey(i + "_" + j)) {
                    continue;
                }
                ans++;
                visited.put(i + "_" + j, true);
                visitedAround(i, j, grid);
            }
        }
        return ans;
    }

    private void visitedAround(int i, int j, char[][] grid) {
        if (i >= 1) {
            int tmp = i - 1;
            if (grid[tmp][j] == '1' && !visited.containsKey(tmp + "_" + j)) {
                visited.put(tmp + "_" + j, true);
                visitedAround(tmp, j, grid);
            }
        }
        if (i < grid.length - 1) {
            int tmp = i + 1;
            if (grid[tmp][j] == '1' && !visited.containsKey(tmp + "_" + j)) {
                visited.put(tmp + "_" + j, true);
                visitedAround(tmp, j, grid);
            }
        }
        if (j >= 1) {
            int tmp = j - 1;
            if (grid[i][tmp] == '1' && !visited.containsKey(i + "_" + tmp)) {
                visited.put(i + "_" + tmp, true);
                visitedAround(i, tmp, grid);
            }
        }
        if (j < grid[0].length - 1) {
            int tmp = j + 1;
            if (grid[i][tmp] == '1' && !visited.containsKey(i + "_" + tmp)) {
                visited.put(i + "_" + tmp, true);
                visitedAround(i, tmp, grid);
            }
        }
    }
}
