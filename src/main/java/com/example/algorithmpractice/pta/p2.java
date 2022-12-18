package com.example.algorithmpractice.pta;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 9:56
 */
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int len=n;
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(s);
        char[] chars = s.toCharArray();
        char[][] arr=new char[n][n];
        int cn=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[i][j]=chars[cn];
            }
            for (int j = i; j < n; j++) {
                arr[j][i]=chars[cn];
            }
            for (int j = i; j < n; j++) {
                arr[n-1][j]=chars[cn];
            }
            for (int j = i; j < n; j++) {
                arr[j][n-1]=chars[cn];
            }
//            i++;
            n--;
            cn++;
        }
//        String.valueOf(arr[1])
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }


        for (int i = 0; i < len; i++) {
            String ss= String.valueOf(arr[i]);
            System.out.println(ss);
        }
    }
}
