package com.huaiwei.e.easy;

public class 岛屿的数量 {
    public int numIslands(char[][] grid) {
        int res=0;
        for (int l=0;l<grid.length;l++){
            for (int r=0;r<grid[0].length;r++){
                if (grid[l][r]=='1'){
                    dfs(grid,l,r);
                    res++;
                }
            }
        }
        return res;
    }
    public static void dfs(char[][] grid,int l,int r){
        if (!isLand(grid,l,r)) return;
        if (grid[l][r]!='1') return;
        if (grid[l][r]=='1') grid[l][r]='2';
        dfs(grid,l-1,r);
        dfs(grid,l+1,r);
        dfs(grid,l,r-1);
        dfs(grid,l,r+1);
    }
    public static boolean isLand(char[][] grid,int l,int r){
        return l<grid.length&&l>=0&&r>=0&&r<grid[0].length;
    }
}
