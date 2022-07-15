package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/6 23:11
 */
public class t66 {
//    public int[] constructArr(int[] a) {
//        //先检查是否含0
//        int f=-1;
//        int sum=1;
//        int len = a.length;
//        for (int i = 0; i <len ; i++) {
//            if(a[i]==0){
//                f=i;
//            }
//        }
//
//
//        for (int i = 0; i <len; i++) {
//            sum*=a[i];
//        }
//        int[] b=new int[len];
//        for (int i = 0; i < len; i++) {
//            b[i]=sum/a[i];
//        }
//        return b;
//    }

    public int[] constructArr(int[] a){
        int len=a.length;
        if(len==0){
            return new int[0];
        }
        int[] L=new int[len];
        int[] R=new int[len];
        int[] ans=new int[len];
        //左边
        L[0]=1;
        for (int i = 1; i < len; i++) {
            L[i]=L[i-1]*a[i-1];
        }
        //右边
        R[len-1]=1;
        for (int i = len-2; i >=0;i--) {
            R[i]=R[i+1]*a[i+1];
        }
        //左右相乘
        for (int i = 0; i < len; i++) {
            ans[i]=L[i]*R[i];
        }
        return ans;
    }
}
