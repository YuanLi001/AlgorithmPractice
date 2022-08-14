package com.example.algorithmpractice.specialbreakthrough.third;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/14 10:35
 */
public class t0001 {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int col = row;
        int[][] arr=new int[row-2][col-2];
        for (int i = 0; i <row-2; i++) {
            for (int j = 0; j < col - 2; j++) {
                arr[i][j]=getMax(grid,i,j);
            }
        }
        return arr;
    }

    public int getMax(int[][] grid,int x,int y){
        int max=0;
        for (int i = x; i <=x+2 ; i++) {
            for (int j = y; j <=y+2 ; j++) {
                if(max<grid[i][j]){
                    max=grid[i][j];
                }
            }
        }
        return max;
    }
}
