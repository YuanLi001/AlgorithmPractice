package com.example.algorithmpractice.hot100.yunzhi;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/18 21:01
 */
public class t11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        //初始化xors
        int chushiXors=0;
        int end=1000000;
        int[] allXors=new int[end+1];
        for (int i = 1; i <=end ; i++) {
            chushiXors=chushiXors^i;
            allXors[i]=chushiXors;
        }
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = sc.nextInt();

            int xors = allXors[n]^sum;
            System.out.println(xors);
        }
    }


}
