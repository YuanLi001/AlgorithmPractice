package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Other;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/11 10:30
 */
public class t6 {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        if(nums[len-1]!=len){
            return len;
        }
        for (int i = 1; i <len; i++) {
            if(nums[i]-1!=nums[i-1]){
                return nums[i]-1;
            }
        }
        return -1;
    }
}
