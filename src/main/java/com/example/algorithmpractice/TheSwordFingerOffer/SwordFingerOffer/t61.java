package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/25 19:04
 */
public class t61 {
    public boolean isStraight(int[] nums) {
        int len=nums.length;
        int position;
        int[] arr=new int[14];
        for (int i = 0; i < len; i++) {
            position=nums[i];
            arr[position]++;
            if(position!=0 && arr[position]>1 ){
                return false;
            }
        }
        int left=1,right=13;
        while ( arr[left]==0){
            left++;
        }
        while ( arr[right]==0){
            right--;
        }
        while (true){
            left++;
            if(left==right){
                return true;
            }else{
                if( arr[left]==0){
                    if(arr[0]>0){
                        arr[0]--;
                    }else{
                        return false;
                    }
                }
            }
        }
    }
}
