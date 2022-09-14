package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/14 7:59
 */
public class MySqrt {
    public int mySqrt(int x) {
        int left=1,right=x;
        int mid=left+(right-left)/2;
        int ans=0;
        while (left<=right){
            System.out.println(mid);
            long v=(long) mid*mid;
            if(v==x){
                return mid;
            }else if(v<x){
                left=mid+1;
                ans=mid;
            }else {
                right=mid-1;
            }
            mid=left+(right-left)/2;
        }
        return ans;
    }
}
