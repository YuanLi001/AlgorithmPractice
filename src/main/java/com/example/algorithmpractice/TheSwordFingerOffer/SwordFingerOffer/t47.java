package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/18 8:43
 */
public class t47 {
    int[][] grid;
    int[][] arrMax;
    int row,column;
    public int maxValue(int[][] grid) {
        row= grid.length;
        column=grid[0].length;
        arrMax=new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrMax[i][j]=-1;
            }
        }
        arrMax[0][0]=grid[0][0];
        this.grid=grid;
        return getMaxValue(row-1,column-1);
    }

    public int getMaxValue(int r,int c){
        if( arrMax[r][c]==-1 ){
            if(r==0){
                arrMax[r][c]=getMaxValue(r,c-1)+grid[r][c];
            }else if (c==0){
                arrMax[r][c]=getMaxValue(r-1,c)+grid[r][c];
            }else{
                arrMax[r][c]=Math.max( getMaxValue(r-1,c)+grid[r][c],getMaxValue(r,c-1)+grid[r][c]   );
            }
        }
        return arrMax[r][c];
    }
}
