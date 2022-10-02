package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/2 9:41
 */
public class Rob {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        if(len==3){
            return Math.max(nums[0]+nums[2],nums[1]);
        }
        int[] total=new int[len];
        total[0]=nums[0];
        total[1]=nums[1];
        total[2]=nums[0]+nums[2];
        for (int i = 3; i < len; i++) {
            total[i]=Math.max(total[i-2]+nums[i],total[i-3]+nums[i] );
        }
        return Math.max(total[len-1],total[len-2]);
    }
}
