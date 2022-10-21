package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/20 15:10
 */
public class MaxAreaOfIsland {
    int[][] arrive;
    int row,col;
    public int maxAreaOfIsland(int[][] grid) {
        row=grid.length;
        col=grid[0].length;
        arrive=new int[row][col];
        int max=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int cn = getArea(i, j, grid);
                max=Math.max(max,cn);
            }
        }
        return max;
    }

    public int getArea(int i ,int j,int[][] grid){
        if(i<0 || i>=row || j<0 || j>=col || arrive[i][j]==1){
            return 0;
        }
        arrive[i][j]=1;
        if(grid[i][j]==0){
            return 0;
        }else {
            return 1+getArea(i-1,j,grid)+getArea(i+1,j,grid)+getArea(i,j-1,grid)+getArea(i,j+1,grid);
        }
    }
}
