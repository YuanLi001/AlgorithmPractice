package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/11 10:36
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] ans = new int[r][c];
        ans[0][0] = grid[0][0];
        for (int i = 1; i < r; i++) {
            ans[i][0] = ans[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < c; i++) {
            ans[0][i] = ans[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                ans[i][j]=Math.min( ans[i-1][j],ans[i][j-1] ) + grid[i][j];
            }
        }
        return ans[r-1][c-1];
    }
}
