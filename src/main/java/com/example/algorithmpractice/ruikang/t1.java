package com.example.algorithmpractice.ruikang;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/7/15 13:49
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][4];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            arr[one][two]++;
        }
        System.out.println(arr[0][1]+" "+arr[0][2]+" "+arr[0][3]);
        System.out.println(arr[1][1]+" "+arr[1][2]+" "+arr[1][3]);
        if(arr[0][1]>arr[1][1]){
            System.out.println("The first win!");
        }else if(arr[0][2]>arr[1][2]){
            System.out.println("The first win!");
        }else if(arr[0][3]>arr[1][3]){
            System.out.println("The first win!");
        }else {
            System.out.println("The second win!");
        }
    }
}
