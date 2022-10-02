package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/2 9:21
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==2){
            return Math.min(cost[0],cost[1]);
        }
        int[] total=new int[len];
        total[0]=0;
        total[1]=0;
        for (int i = 2; i < len; i++) {
            total[i]=Math.min(total[i-2]+cost[i-2],total[i-1]+cost[i-1]);
        }
        return Math.min( total[len-2]+cost[len-2],total[len-1]+cost[len-1] );
    }
}
