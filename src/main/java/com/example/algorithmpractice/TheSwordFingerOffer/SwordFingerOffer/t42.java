package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/18 8:33
 */
public class t42 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        arr[0] = nums[0];
        for (int i = 1; i < len; i++) {
            arr[i] = Math.max(arr[i - 1] + nums[i], nums[i]);
        }
        int max=arr[0];
        for (int i = 0; i < len; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
