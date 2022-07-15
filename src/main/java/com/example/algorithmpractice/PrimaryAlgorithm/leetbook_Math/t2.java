package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Math;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/9 9:47
 */
public class t2 {
    public int countPrimes(int n) {
        int cn=0;
        for (int i = 2; i <n; i++) {
            if(  isPrime(i) ){
                cn++;
            }
        }
        return cn;
    }

    public boolean isPrime(int num){
        if(num==1){
            return false;
        }
//        for (int i = 2; i <=num/2; i++) {
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a=5;
        double b;
        b=a;
        System.out.println(a);
        System.out.println(b);
    }
}
