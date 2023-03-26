package com.example.algorithmpractice.hot100.tenxun;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/26 21:37
 */
public class t44p {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums=new long[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextLong();
        }
        long[][] mutiVal=new long[n][n];
        long[][] xor=new long[n][n];
        for (int i = 0; i < n; i++) {
            mutiVal[i][i]=nums[i];
            xor[i][i]=nums[i];
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                mutiVal[i][j]=mutiVal[i][j-1]*nums[j];
//                xor[i][j]=xor[i][j-1]^nums[j];
//            }
//        }
        for (int i = n-1; i >=0; i--) {
            for (int j = i-1; j >=0; j--) {
                mutiVal[i][j]=mutiVal[i][j+1]*nums[j];
                xor[i][j]=xor[i][j+1]^nums[j];
            }
        }
        int cn=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if( mutiVal[i][j]==xor[i][j]){
                    cn++;
                }
            }
        }
        System.out.println(cn);
    }
}
