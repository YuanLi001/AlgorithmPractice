package com.example.algorithmpractice.part1_array;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/20 18:33
 */
public class s27 {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int n= nums.length;
        if(n==0){
            return 0;
        }
        int fast=0,slow=0;
        while (fast<n){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
