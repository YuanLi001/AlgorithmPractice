package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/20 19:48
 */
public class t57 {
    public int[] twoSum(int[] nums, int target) {
        int left=0,right= nums.length-1,sum;

        while (left<right){
            sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{nums[left],nums[right]};
            }else if(sum<target){
                left++;
            }else {
                right--;
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        int[] a=new int[]{1,2,3};
//        System.out.println(a);
//        for(int qwe:a){
//            System.out.println(qwe);
//        }
//    }
}
