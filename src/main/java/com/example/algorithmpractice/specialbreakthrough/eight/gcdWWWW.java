package com.example.algorithmpractice.specialbreakthrough.eight;

import java.math.BigInteger;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/24 6:50
 */
public class gcdWWWW {
//    public static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }

    public int gcd(int a, int b){
        while (b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }


    public static void main(String[] args) {
//        System.out.println(gcd(4,5));
//        System.out.println(gcd(5,4));
//        System.out.println(gcd(10,5));
//        System.out.println(gcd(5,10));

//        BigInteger b1 = BigInteger.valueOf(a);
//        BigInteger b2 = BigInteger.valueOf(b);
//        BigInteger gcd = b1.gcd(b2);
    }
}
