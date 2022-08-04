package com.example.algorithmpractice.specialbreakthrough.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/4 10:33
 */
public class t009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int ret=0,prod=1;
        int j=0;
        for (int i = 0; i < len; i++) {
            prod*=nums[i];
            while (j<=i && prod>=k){
                prod/=nums[j];
                j++;
            }
            ret=ret+i-j+1;
        }
        return ret;
    }
}
