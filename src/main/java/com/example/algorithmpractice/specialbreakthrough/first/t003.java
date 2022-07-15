package com.example.algorithmpractice.specialbreakthrough.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/9 14:10
 */
public class t003 {
    public int[] countBits(int n) {
        int[] ret=new int[n+1];
        for (int i = 0; i <=n; i++) {
            ret[i]=countNumBit(i);
        }
        return ret;
    }

    public int countNumBit(int num){
        int cn=0;
        while (num!=0){
            if(num%2==1){
                cn++;
            }
            num/=2;
        }
        return cn;
    }
}
