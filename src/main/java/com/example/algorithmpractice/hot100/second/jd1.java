package com.example.algorithmpractice.hot100.second;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/2/3 10:22
 */
public class jd1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[m];
        for (int i = 0; i < m; i++) {
            arr[i]=sc.nextInt();
        }
        if(n-m>1){
            System.out.println("No");
        }
        //先看是不是升序
        for (int i = 0; i < m; i++) {
            if(i>0&&arr[i]<=arr[i-1]){
                System.out.println("No");
                return;
            }
        }
        //看差值是不是1
        int num = arr[m-1]+1;
        int cn=0;
        for (int i = 0; i < m; i++) {
            if(i>0&& (arr[i] - arr[i-1]) !=1 ){

                num=arr[i]-1;
                cn++;
            }
            if(cn>1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        System.out.println(num);
    }
}
