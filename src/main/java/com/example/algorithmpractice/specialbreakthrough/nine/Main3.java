package com.example.algorithmpractice.specialbreakthrough.nine;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/29 15:29
 */


class Main3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int cn=0;
        int num;
        int index=0;
        for (int x =n; x >=1; x--) {
            for (int i=index+1; x*i <=n;i++) {
                num=0;
                for (int j = 1; x*i*j <=n; j++) {
                    if(gcd(i,j)==1){
                        num++;
                    }
                }
                int beMuti = getNum(x);
                cn=cn+num*beMuti;
                if(cn>=998244353){
                    cn%=998244353;
                }
                index=i;
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

    public static int getNum(int n){
        int i=n;
        int sum=0;
        while (i!=0){
            sum+=(n/i);
            i--;
        }
        return sum;
    }
}


//    // 1 1 1
//    // 1 1 1  1 1 2  1 2 2   2 2 2
//    // 1 1 1  1 1 2  1 1 3   1 2 2  1 3 3   2 2 2   3 3 3
//    // 1 1 1  1 1 2  1 1 3   1 1 4  1 2 2   1 2 4   1 3 3   1 4  4    2 2 2   2 2 4  2 4 4   3 3 3    4 4 4