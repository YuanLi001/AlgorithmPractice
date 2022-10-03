package com.example.algorithmpractice.specialbreakthrough.seven;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/3 8:36
 */
public class Rob2 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==1){
            return nums[0];
        }
        if(len==2){
            return Math.max(nums[0],nums[1]);
        }
        //偷第一个，则不能考虑最后一个
        int pre=nums[0],cur=nums[0],next;
        for (int i = 2; i < len-1; i++) {
            next=Math.max(cur,pre+nums[i] );
            pre=cur;
            cur=next;
        }
        int temp=cur;
        //不偷第一个
        pre=0;
        cur=nums[1];
        for (int i = 2; i < len; i++) {
            next=Math.max(cur,pre+nums[i] );
            pre=cur;
            cur=next;
        }
        return Math.max(temp,cur);
    }
}
