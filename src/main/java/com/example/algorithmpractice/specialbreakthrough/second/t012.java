package com.example.algorithmpractice.specialbreakthrough.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/5 8:36
 */
public class t012 {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum=0;
        int sumSubNum;
        int leftSum=0;
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
        }
        //1.sum能被2整除   2.0~i的和等于sun的一半
        for (int i = 0; i < len; i++) {
            if(i!=0){
                leftSum+=nums[i-1];
            }
            sumSubNum=sum-nums[i];
            if(sumSubNum%2!=0){
                continue;
            }
            if(leftSum==sumSubNum/2){
                return i;
            }
        }
        return -1;
    }
}
