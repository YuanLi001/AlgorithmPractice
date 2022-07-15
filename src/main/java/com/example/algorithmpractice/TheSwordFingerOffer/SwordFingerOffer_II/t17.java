package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/25 21:59
 */
public class t17 {
    public int[] printNumbers(int n) {
        int max=0,x=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                x*=10;
            }
            max+=9*x;
            x=1;
        }
        int[] arr=new int[max];
        for (int i = 0; i < max; i++) {
            arr[i]=i+1;
        }
        return arr;
    }
}
