package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/13 9:27
 */
public class t3 {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            arr[num]++;
            if(arr[num]!=0){
                return num;
            }
        }
        return -1;
    }
}
