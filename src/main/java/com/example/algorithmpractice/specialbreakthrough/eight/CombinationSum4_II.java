package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/20 14:58
 */
public class CombinationSum4_II {
    public int combinationSum4(int[] nums, int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        for (int i = 1; i <=target; i++) {
            for(int num:nums){
                if(i>=num){
                    dp[i]+=dp[i-num];
                }
            }
        }
        return dp[target];
    }
}
