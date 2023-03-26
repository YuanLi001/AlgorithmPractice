package com.example.algorithmpractice.hot100.tenxun;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/26 21:22
 */
public class t444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        long mutiVal;
        long xor;
        int cn = 0;
        for (int i = 0; i < n; i++) {
            mutiVal = nums[i];
            xor = nums[i];
            if (mutiVal == xor) {
                cn++;
            }
            for (int j = i + 1; j < n; j++) {
                mutiVal = mutiVal * nums[j];
                xor = xor ^ nums[j];
                if( mutiVal==xor ){
                    cn++;
                }
            }
        }
        System.out.println(cn);
    }
}
