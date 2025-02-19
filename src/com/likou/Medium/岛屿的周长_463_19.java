package com.likou.Medium;

public class 岛屿的周长_463_19 {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int raid = 4;
                    if (i > 0 && grid[i - 1][j] == 1) raid--;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) raid--;
                    if (j > 0 && grid[i][j - 1] == 1) raid--;
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) raid--;
                    sum += raid;
                }

            }

        }
        return sum;
    }


}
