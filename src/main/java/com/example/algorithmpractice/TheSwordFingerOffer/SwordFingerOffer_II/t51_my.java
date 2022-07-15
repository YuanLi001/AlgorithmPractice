package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_II;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/27 19:56
 */
public class t51_my {

    public int reversePairs(int[] nums) {
        int len = nums.length;
        if(len<2){
            return 0;
        }

        return recurseFunc(nums,0,len-1);
    }

    private int recurseFunc(int[] nums, int left, int right) {
        if(left==right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int leftCount=recurseFunc(nums,left,mid);
        int rightCount=recurseFunc(nums,mid+1,right);
        int mergeCount=mergeLeftAndRight(nums,left,mid,right);
        return leftCount+rightCount+mergeCount;
    }

    private int mergeLeftAndRight(int[] nums, int left, int mid, int right) {
        int len= nums.length;
        int[] temp=new int[len];
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }
        int cn=0;
        int i=left;
        int j=mid+1;
        int k=left;
//        while ( i!=mid+1 && j!=right+1){
//            if( i==mid+1 ){
//                nums[k]=temp[j];
//                j++;
//            }else if(j==right+1){
//                nums[k]=temp[i];
//                i++;
//            }else if(temp[i]<=temp[j]){
//                nums[k]=temp[i];
//                i++;
//            }else{
//                nums[k]=temp[j];
//                j++;
//                cn=cn+mid-i+1;
//            }
//            System.out.println(nums[k]);
//            // 5 7   4 6
//            //
//            k++;
//        }

        for (; k <= right; k++) {

            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
                cn += (mid - i + 1);
            }
        }
        return cn;
    }
}
