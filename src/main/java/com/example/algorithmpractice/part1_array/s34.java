package com.example.algorithmpractice.part1_array;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/21 11:31
 */
public class s34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int l=0,r= nums.length-1;
        int mid=(l+r)/2;
        int f=-1;
        while (l<=r){
            if(target==nums[mid]){
                f=mid;
                break;// 1 2 3 4 5 // 0 1 2 3 4
            }
            if(target<nums[mid]){
                r=mid-1;
            }else{
                l=mid+1;
            }
            mid=(l+r)/2;
        }
        if(f!=-1){
            l=r=f;
            while (l>=0&&nums[l]==target){
                l--;
            }
            while (r<=(nums.length-1)&&nums[r]==target){
                r++;
            }
            res[0]=l+1;
            res[1]=r-1;
        }
        return  res;
    }
}
