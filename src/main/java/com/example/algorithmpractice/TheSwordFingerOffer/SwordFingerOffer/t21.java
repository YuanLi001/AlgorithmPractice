package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/19 10:00
 */
public class t21 {
    public int[] exchange(int[] nums) {
        int left=0,right= nums.length-1,temp;
        while (left<right){
            if(nums[left]%2==0 && nums[right]%2==1){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }else if(nums[left]%2==0 && nums[right]%2==0){
                right--;
            }else if(nums[left]%2==1 && nums[right]%2==1){
                left++;
            }else {
                left++;
                right--;
            }
        }
         return nums;
    }

    public int[] exchange2(int[] nums) {
        int left=0,right= nums.length-1,temp;
        while (left<right){
            if(nums[left]%2!=0){
                left++;
                continue;
            }
            if(nums[right]%2!=1){
                right--;
                continue;
            }
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    }
}
