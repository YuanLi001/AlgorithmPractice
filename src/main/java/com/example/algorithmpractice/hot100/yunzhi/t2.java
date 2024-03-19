package com.example.algorithmpractice.hot100.yunzhi;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/18 21:21
 */
public class t2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int res = cal(n, m, k);
        System.out.println(res);
    }

    public static int cal(int n,int m,int k){
//        int rem=m-n;
//        int maxApp=n+Math.min(rem,k-1);
        int minApp=m/n;
        int rem=m%n;
        int maxApp=minApp+(k<=rem?1:0);
        return maxApp;
    }
}
