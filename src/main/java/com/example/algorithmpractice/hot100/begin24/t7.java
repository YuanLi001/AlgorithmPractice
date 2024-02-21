package com.example.algorithmpractice.hot100.begin24;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/20 12:51
 */
public class t7 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
