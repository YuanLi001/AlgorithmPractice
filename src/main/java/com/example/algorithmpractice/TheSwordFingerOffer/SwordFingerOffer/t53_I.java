package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/13 9:38
 */
public class t53_I {
    public int search(int[] nums, int target) {
        int cn=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                cn++;
            }
        }
        return cn;
    }

    public static int search2(int[] nums, int target) {
        int left=0,right= nums.length-1;
        int mid=left+(right-left)/2;
        while (left<=right){
            if(nums[mid]==target){
                break;
            }else if( nums[mid]<target ){
                left=mid+1;
            }else {
                right=mid-1;
            }
            mid=left+(right-left)/2;
        }
        //没有找到
        if(left>right){
            return 0;
        }
        //找到
        int cn=1,j=mid-1;
        while (j>=left){
            if( nums[j]==target ){
                cn++;
                j--;
            }else {
                break;
            }

        }
        j=mid+1;
        while (j<=right){
            if( nums[j]==target){
                cn++;
                j++;
            }else{
                break;
            }

        }
        return cn;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,2};
//        for (int i :
//                arr) {
//            System.out.println(i);
//        }
        int cn = search2(arr, 2);
        System.out.println(cn);
    }
}
