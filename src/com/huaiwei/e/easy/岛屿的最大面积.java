package com.huaiwei.e.easy;

public class 岛屿的最大面积 {
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int l = 0; l < grid.length; l++) {
            for (int r = 0; r < grid[0].length; r++) {
                if (grid[l][r] == 1) {

                    res = Math.max(res, dfs(grid, l, r));
                }
            }
        }
        return res;
    }

    public static int dfs(int[][] grid, int l, int r) {
        if (!isLand(grid, l, r)) return 0;
        if (grid[l][r] != 1) return 0;
        if (grid[l][r] == 1) grid[l][r] = 2;

        return 1 + dfs(grid, l - 1, r) + dfs(grid, l + 1, r) + dfs(grid, l, r - 1) + dfs(grid, l, r + 1);
    }

    public static boolean isLand(int[][] grid, int l, int r) {
        return l < grid.length && l >= 0 && r >= 0 && r < grid[0].length;
    }
}
