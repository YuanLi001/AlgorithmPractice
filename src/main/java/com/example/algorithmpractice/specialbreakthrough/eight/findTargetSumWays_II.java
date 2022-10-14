package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/14 16:32
 */
public class findTargetSumWays_II {
    public int findTargetSumWays(int[] nums, int target){
        int sum=0;
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        int diff=sum-target;
        if(diff<0 || diff%2!=0) return 0;
        int neg=diff/2;
        int[][] dp=new int[n+1][neg+1];
        dp[0][0]=1;
        for (int i = 1; i < n+1; i++) {
            int num=nums[i-1];
            for (int j = 0; j < neg + 1; j++) {
                dp[i][j]=dp[i-1][j];
                if(j>=num){
                    dp[i][j]+=dp[i-1][j-num];
                }
            }
        }
        return dp[n][neg];
    }
}
