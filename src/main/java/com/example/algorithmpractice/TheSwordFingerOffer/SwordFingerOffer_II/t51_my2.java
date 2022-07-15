package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/27 20:51
 */
public class t51_my2 {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if(len<2){
            return 0;
        }
        int[] temp=new int[len];
        return recurseFunc(nums,0,len-1,temp);
    }

    private int recurseFunc(int[] nums, int left, int right, int[] temp) {
        if(left==right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int leftCount=recurseFunc(nums,left,mid, temp);
        int rightCount=recurseFunc(nums,mid+1,right, temp);
        int mergeCount=mergeLeftAndRight(nums,left,mid,right,temp);
        return leftCount+rightCount+mergeCount;
    }

    private int mergeLeftAndRight(int[] nums, int left, int mid, int right, int[] temp) {
        int len= nums.length;
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int cn=0;
        int i=left;
        int j=mid+1;
        int k=left;
        while ( k <= right ){
            if( i==mid+1 ){
                nums[k]=temp[j];
                j++;
            }else if(j==right+1){
                nums[k]=temp[i];
                i++;
            }else if(temp[i]<=temp[j]){
                nums[k]=temp[i];
                i++;
            }else{
                nums[k]=temp[j];
                j++;
                cn=cn+mid-i+1;
            }
            System.out.println(nums[k]);
            k++;
        }

        return cn;
    }
}
