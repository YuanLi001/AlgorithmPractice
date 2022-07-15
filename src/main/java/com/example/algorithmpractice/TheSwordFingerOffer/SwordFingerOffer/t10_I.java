package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/17 8:59
 */
public class t10_I {
    static int[] arr=new int[110];

    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1=0,f2=0;
        if( arr[n-1]==0 ){
            arr[n-1] = fib(n - 1);
        }
        f1=arr[n-1];
        if(arr[n-2]==0){
            arr[n-2] = fib(n - 2);
        }
        f2=arr[n-2];
        return (f1+f2)%1000000007;
    }

    public static void main(String[] args) {
        System.out.println( fib(2));
    }
}
