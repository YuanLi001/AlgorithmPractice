package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/30 10:10
 */
//class Main {
//    // 1 1 2
//    // 1 1 1        1 2 2   2 2 2
//    // 1 1 1    1 2 2   1 3 3  2 2 2    3 3 3
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int cn=0;
//        for (int x =1; x <=n; x++) {
//            for (int y=x,yi=1; y <=n; y++) {
//                if(y%x!=0){
//                    continue;
//                }
//                for (int z = y; z <=n; z++) {
//                    if(z%y!=0){
//                        continue;
//                    }else {
//                        int a=y/x,b=y/z;
//                        if(a!=0 && b!=0 && gcd(a,b)==1){
//                            cn++;
//                            if(cn>=998244353){
//                                cn%=998244353;
//                            }
//                        }
//                    }
//
//                }
//            }
//        }
//        System.out.println(cn);
//    }
//
//    public static int gcd(int a, int b){
//        while (b != 0){
//            int tmp = a % b;
//            a = b;
//            b = tmp;
//        }
//        return a;
//    }
//}


class Main {
    // 1 1 1
    // 1 1 1        1 2 2   2 2 2
    // 1 1 1    1 2 2   1 3 3  2 2 2    3 3 3

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int cn=0;
        int y,z;
        for (int x =1; x <=n; x++) {
            y=x;
            for (int i=2; y <=n;i++) {
                z=y;
                for (int j = 2; z <=n; j++) {
                    int a=y/x,b=y/z;
                    if(a!=0 && b!=0 && gcd(a,b)==1){
                        cn++;
                        if(cn>=998244353){
                            cn%=998244353;
                        }
                    }
                    z=z*j;
                }
                y=y*i;
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