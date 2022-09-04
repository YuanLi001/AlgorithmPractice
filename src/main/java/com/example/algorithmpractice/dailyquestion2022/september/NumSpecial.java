package com.example.algorithmpractice.dailyquestion2022.september;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/4 19:45
 */
public class NumSpecial {

    public int numSpecial(int[][] mat) {
        int cn=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(ifSpe(mat,i,j)){
                    cn++;
                }
            }
        }
        return cn;
    }

    public boolean ifSpe(int[][] mat,int row,int col){
        if(mat[row][col]!=1){
            return false;
        }
        for (int i = 0; i < mat[0].length; i++) {
            if(i!=col && mat[row][i]==1){
                return false;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if(i!=row && mat[i][col]==1){
                return false;
            }
        }
        return true;
    }

}
