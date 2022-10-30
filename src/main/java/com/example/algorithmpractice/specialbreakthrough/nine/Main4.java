package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/29 15:29
 */


class Main4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int cn=0;
        int[] arr=new int[n+1];
        for (int x =1; x <=n; x++) {
            for (int i=1; x*i <=n;i++) {
                if(i==1){
                    cn+=(n/x/i);
                }
                for (int j = 1; x*i*j <=n; j++) {
                    if(gcd(i,j)==1){
                        cn++;
                        if(cn>=998244353){
                            cn%=998244353;
                        }
                    }
                }
            }
        }
        System.out.println(cn);
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}


//    // 1 1 1
//    // 1 1 1  1 1 2  1 2 2   2 2 2
//    // 1 1 1  1 1 2  1 1 3   1 2 2  1 3 3   2 2 2   3 3 3
//    //