package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/15 6:46
 */
public class MinEatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {
        int max = getMax(piles);
        if(piles.length==h){
            return max;
        }
        int left=1,right=max;
        int mid=left+(right-left)/2;
        int ans=-1;
        while (left<=right){
            int hours = getHours(piles, mid);
            if(hours==h){
                ans=mid;
                right=mid-1;
            }else if(hours>h){
                left=mid+1;
            }else {
                ans=mid;
                right=mid-1;
            }
            mid=left+(right-left)/2;
        }
        return ans;
    }

    public int getMax(int[] arr){
        int max=-1;
        for (int i = 0; i < arr.length; i++) {
            max= Math.max(max,arr[i]);
        }
        return max;
    }

    public int getHours(int[] arr,int num){
        int cn=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num==0) cn=cn+arr[i]/num;
            else cn=cn+arr[i]/num+1;
        }
        return cn;
    }
}
