package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/29 15:29
 */


class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[101][101];
        int cn=0;
        int y,z;
        for (int x =1; x <=n; x++) {
            y=x;
            for (int i=2; y <=n;i++) {
                z=y;
                for (int j = 2; z <=n; j++) {
                    int a=y/x,b=z/y;
//                    if(a!=0 && b!=0 && gcd(a,b)==1){
                    if(a<=100 && b<=100){
                        if(arr[a][b]==1){
                            cn++;
                        }else {
                            if(gcd(a,b)==1){
                                arr[a][b]=1;
                                cn++;
                                if(cn>=998244353){
                                    cn%=998244353;
                                }
                            }
                        }
                    }else {
                        if(gcd(a,b)==1){
//                            arr[a][b]=1;
                            cn++;
                            if(cn>=998244353){
                                cn%=998244353;
                            }
                        }
                    }



                    z=y*j;
                }
                y=x*i;
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