package com.example.algorithmpractice.specialbreakthrough.eight;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/14 15:55
 */
public class FindTargetSumWays {
    int sum=0;
    int target;
    int cn=0;
    public int findTargetSumWays(int[] nums, int target) {
        this.target=target;
        dfs(0,nums.length-1,nums);
        return cn;
    }

    public void dfs(int left,int right,int[] nums){
        if(left>right) {
            if(sum==target){
                cn++;
            }
            return;
        }
        //先加
        sum+=nums[left];
        dfs(left+1,right,nums);
        //回溯
        sum-=nums[left];
        //再减
        sum-=nums[left];
        dfs(left+1,right,nums);
        //回溯
        sum+=nums[left];
    }
}
