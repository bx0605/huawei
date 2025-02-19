package com.likou.Medium;

public class 岛屿数量_200_20 {
    public int numIslands(char[][] grid) {
        int n=0;
        for (int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    n++;
                    dfs(grid,i,j);
                }
            }
        }
        return n;
    }
    public static void dfs(char[][] grid,int l,int r){
        if (!isLand(grid,l,r)){
            return;
        }
        if (grid[l][r]!='1'){
            return;
        }
        if (grid[l][r]=='1'){
            grid[l][r]=2;
        }
        dfs(grid,l-1,r);
        dfs(grid,l,r-1);
        dfs(grid,l,r+1);
        dfs(grid,l+1,r);
    }
    public static boolean isLand(char[][] grid,int l,int r){
        return l>=0&&l< grid.length&&r>=0&&r<grid[0].length;
    }
}
