package com.example.algorithmpractice.hot100.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 14:46
 */
public class t_53 {

    public int maxSubArray(int[] nums) {
        int pre=0,maxAns=nums[0];
        for(int x:nums){
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
