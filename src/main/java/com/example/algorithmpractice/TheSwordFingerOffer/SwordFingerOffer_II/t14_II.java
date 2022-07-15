//package com.example.algorithmpractice.SwordFingerOffer_II;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/4/28 19:28
// */
//public class t14_II {
//    public int cuttingRope(int n) {
//        if(n==2){
//            return 1;
//        }
//        int[] arr=new int[n+1];
//        arr[2]=1;
//        for (int i = 1; i < ; i++) {
//
//        }
//    }
//
//    public int integerBreak(int n) {
//        int[] dp = new int[n + 1];
//        for (int i = 2; i <= n; i++) {
//            int curMax = 0;
//            for (int j = 1; j < i; j++) {
//                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
//            }
//            dp[i] = curMax;
//        }
//        return dp[n];
//    }
//
//}
