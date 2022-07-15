package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/9 15:16
 */
public class t29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0){
            return new int[0];
        }
        int height=matrix.length, width=matrix[0].length;
        int num=height*width;
        int top=0,bottom=height-1;
        int left=0,right=width-1;
        int cn=0;
        int i;
        int[] arr=new int[height * width];
        while (top<=bottom && left<=right && cn<num){
            //上层从左到右 (top,left)--(top,right)
            for (i = left; i <=right && cn<num ; i++) {
                System.out.println(matrix[top][i]);
                arr[cn]=matrix[top][i];
                cn++;
            }
            //右边从上到下 (top+1,right)--(bottom,right)
            for (i = top+1;  i<=bottom&& cn<num ; i++) {
                arr[cn]=matrix[i][right];
                cn++;
            }
            //下层从右到左 (bottom,right)--(bottom,left)
            for (i = right-1;  i>=left+1&& cn<num ; i--) {
                arr[cn]=matrix[bottom][i];
                cn++;
            }
            //左边从下到上 (left,bottom)--(left,top+1)
            for (i = bottom;  i>=top+1&& cn<num ; i--) {
                arr[cn]=matrix[i][left];
                cn++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
    }

    public int[] spiralOrder2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length, columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }


}
