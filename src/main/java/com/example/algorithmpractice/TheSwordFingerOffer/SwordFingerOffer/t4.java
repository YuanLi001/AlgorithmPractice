package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/14 9:15
 */
public class t4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows= matrix.length,columns=matrix[0].length;
        int i=0,j=columns-1;
        while (i<rows && j>=0){
            if( matrix[i][j]==target){
                return true;
            }else if( matrix[i][j]<target ){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}
