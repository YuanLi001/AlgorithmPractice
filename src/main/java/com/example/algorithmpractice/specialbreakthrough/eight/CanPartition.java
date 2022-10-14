package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/14 15:25
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if(len<2) return false;
        int sum=0,maxNum=0;
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
            maxNum=Math.max( nums[i],maxNum );
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        if(maxNum>target) return false;
        boolean[][] dp=new boolean[len][target+1];
        for (int i = 0; i < len; i++) {
            dp[i][0]=true;
        }
        dp[0][nums[0]]=true;
        for (int i = 1; i < len; i++) {
            int num=nums[i];
            for (int j = 1; j < target + 1; j++) {
                if(j>=num){
                    dp[i][j]=dp[i-1][j] | dp[i-1][j-num];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[len-1][target];
    }
}
