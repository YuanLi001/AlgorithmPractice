package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/11 23:01
 */
public class t59_I {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if(nums==null || nums.length==0){
//            return new int[0];
//        }
//        int len = nums.length;
//        int newLen=len-k+1;
//        int[] arr=new int[newLen];
//        int left=0,right=k-1;
//        int cn=0,i,j;
//        int sum;
//        while (right<len){
//            sum=0;
//            if(left==0){
//                for (i = left; i <=right ; i++) {
//                    sum+=nums[i];
//                }
//            }else{
//                sum=arr[cn-1]-nums[left-1]+nums[right];
//            }
//            arr[cn]=sum;
//            cn++;
//            left++;
//            right++;
//        }
//        return arr;
//    }


    public int[] maxSlidingWindow(int[] nums, int k){
        if(nums==null || nums.length==0){
            return new int[0];
        }
        if(k==1){
            return nums;
        }
        if(k==2){
            return easy(nums);
        }
        int len = nums.length;
        int newLen=len-k+1;
        int[] arr=new int[newLen];
        int left=0,right=k-1;
        int cn=0;
        int max,theTailMax=0;
        while (right<len){
            if(left%2==0){
//                tailTwoMax=nums[right-1]>nums[right]?nums[right-1]:nums[right];
                theTailMax=tailMax(nums,left,right);
                max = Math.max( nums[left],theTailMax);
            }else{
                max = Math.max(theTailMax, nums[right]);
            }
            arr[cn]=max;
            cn++;
            left++;
            right++;

        }
        return arr;
    }

    public int tailMax(int[] nums,int left,int right ){
        int max=nums[left+1];
        for (int i = left+2; i <=right; i++) {
            max=Math.max( max,nums[i] );
        }
        return max;
    }

    //k==2
    public int[] easy(int[] nums){
        int len = nums.length;
        int cn=0;
        int[] arr=new int[len-1];
        for (int i = 0; i <=len-2; i++) {
            arr[cn]=Math.max( nums[i],nums[i+1]  );
            cn++;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] qwe=new int[0];
        System.out.println(qwe);
        int[] qwe2=null;
        System.out.println(qwe2);
    }

}
