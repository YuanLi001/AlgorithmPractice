package com.example.algorithmpractice.part3_DynamicProgramming;

import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/6 11:01
 */
public class s120_guanfang {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        int[][] f = new int[n][n];
//        f[0][0] = triangle.get(0).get(0);
//        for (int i = 1; i < n; ++i) {
//            f[i][0] = f[i - 1][0] + triangle.get(i).get(0);
//            for (int j = 1; j < i; ++j) {
//                f[i][j] = Math.min(f[i - 1][j - 1], f[i - 1][j]) + triangle.get(i).get(j);
//            }
//            f[i][i] = f[i - 1][i - 1] + triangle.get(i).get(i);
//        }
//        int minTotal = f[n - 1][0];
//        for (int i = 1; i < n; ++i) {
//            minTotal = Math.min(minTotal, f[n - 1][i]);
//        }
//        return minTotal;
//    }

    public int minimumTotal(List<List<Integer>> triangle){
        int n= triangle.size();
        int[][] arr=new int[n][n];
        arr[0][0]=triangle.get(0).get(0);
        for (int i=1;i<n;i++){
            arr[i][0] = arr[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j <i; j++) {
                arr[i][j]=Math.min( arr[i-1][j-1],arr[i-1][j]  )+triangle.get(i).get(j);
            }
            arr[i][i]=arr[i-1][i-1]+triangle.get(i).get(i);
        }
        int minTotal=arr[n-1][0];
        for (int i = 1; i < n; i++) {
            minTotal=Math.min(minTotal,arr[n-1][i]);
        }
        return minTotal;
    }

}
