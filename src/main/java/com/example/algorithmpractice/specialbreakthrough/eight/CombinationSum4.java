package com.example.algorithmpractice.specialbreakthrough.eight;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/20 10:58
 */
public class CombinationSum4 {

    int sum=0;
    int end;
    int cn=0;
    public int combinationSum4(int[] nums, int target) {
        int len = nums.length;
        end=len-1;
        Arrays.sort(nums);
        dfs(nums,target);
        return cn;
    }

    public void dfs(int[] nums, int target){
        if(sum==target){
            cn++;
            return;
        }
        for (int i = 0; i <=end; i++) {
            if(sum+nums[i]>target){
                break;
            }
            sum+=nums[i];
            dfs(nums,target);
            sum-=nums[i];
        }
    }
}
