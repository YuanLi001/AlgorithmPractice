package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/6 8:40
 */
public class t013_NumMatrix {

    int[][] matrix;

//    public t013_NumMatrix(int age) {
//        this.age = age;
//    }

    public t013_NumMatrix(int[][] matrix) {
        this.matrix=matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
        for (int i = row1; i <=row2 ; i++) {
            for (int j = col1; j <=col2; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
