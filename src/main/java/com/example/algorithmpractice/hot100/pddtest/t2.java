package com.example.algorithmpractice.hot100.pddtest;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/12 19:29
 */
public class t2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[t][n];
        int[] res=new int[t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        //begin
        for (int i = 0; i < t; i++) {
            int oneCn=0;
            for (int j = 0; j < n; j++) {
               if(arr[i][j]==1){
                   oneCn++;
               }
            }
            res[i]=n- oneCn/2;
        }
        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }


}
