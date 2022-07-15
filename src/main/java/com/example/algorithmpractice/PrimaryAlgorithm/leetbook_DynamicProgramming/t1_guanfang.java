package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DynamicProgramming;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/6 9:16
 */
public class t1_guanfang {
//    public int climbStairs(int n) {
//        int p = 0, q = 0, r = 1;
//        for (int i = 1; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = p + q;
//        }
//        return r;
//    }
    // 0 0 1
    // 0 1 1
    // 1 1 2
    // 1 2 3
    // 2 3 5
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int p = 1, q = 2, r=3;
        for (int i = 3; i <= n; ++i) {
            r=p+q;
            p=q;
            q=r;
        }
        return r;
    }
}
