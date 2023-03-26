package com.example.algorithmpractice.hot100.tenxun;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/26 20:49
 */
public class t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        BigDecimal[][] mutiVal=new BigDecimal[n][n];
        int[][] xor=new int[n][n];
        for (int i = 0; i < n; i++) {
            mutiVal[i][i]=new BigDecimal(nums[i]);
            xor[i][i]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
//                if(j!=i){
//                    System.out.println(i+":"+j);
//                    mutiVal[i][j]=mutiVal[i][j-1].multiply( new BigDecimal(nums[j]) );
//                    xor[i][0]=xor[i][j-1]^nums[j];
//                }
//                System.out.println(i+":"+j);
                mutiVal[i][j]=mutiVal[i][j-1].multiply( new BigDecimal(nums[j]) );
                xor[i][j]=xor[i][j-1]^nums[j];
            }
        }
        int cn=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if( mutiVal[i][j].compareTo( new BigDecimal(xor[i][j]) )==0){
//                    System.out.println(i+":"+j+":"+mutiVal[i][j].toString());
                    cn++;
                }
            }
        }
        System.out.println(cn);
    }
}
//System.out.println(1^1);
