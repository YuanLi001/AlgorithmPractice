package com.example.algorithmpractice.hot100.second;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 14:52
 */
public class t_55 {
    public boolean canJump(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(i>k){
                return false;
            }
            k=Math.max(k,i+ nums[i]);
        }
        return true;
    }
}
