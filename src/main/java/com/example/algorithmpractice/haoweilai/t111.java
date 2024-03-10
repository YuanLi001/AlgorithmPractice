package com.example.algorithmpractice.haoweilai;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/7 19:19
 */
public class t111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=1;
        int cn=1;
        for (int i = 1; i < n; i++) {
            if(arr[i]-arr[i-1]>8){
                cn=1;
            }else {
                cn++;
            }
            ans=Math.max(ans,cn);
        }
        System.out.println(ans);
    }
}
