package com.example.algorithmpractice.specialbreakthrough.five;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/4 10:55
 */
public class LongestNiceSubarray {
    public int longestNiceSubarray(int[] nums) {
        int len = nums.length;
        if(len==1){
            return 1;
        }
        int l=0,r=1,ret=1;
        int f=0;
        while (l<len&&r<len){
            for (int i = l; i <= r-1; i++) {
                for (int j = i+1; j <= r; j++) {
                    if( (nums[i] & nums[j])!=0 ){
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    break;
                }

            }
            if(f==1){
                l++;
            }else {
                int ss=r-l+1;
                if(ret<ss){
                    ret=ss;
                }
//                ret=r-l+1;
                r++;
            }
            f=0;
        }
        return ret;
    }
}
