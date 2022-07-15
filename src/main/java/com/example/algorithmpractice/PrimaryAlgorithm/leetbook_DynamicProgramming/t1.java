package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DynamicProgramming;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/6 8:55
 */
public class t1 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        return climbStairs(n-1)+climbStairs(n-2);
        // 45
        // 44 43
        // 43 42    42 41
        //
    }

}
