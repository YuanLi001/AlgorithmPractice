package com.example.algorithmpractice.part1_array;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/3 11:50
 */
public class s16 {
    public static int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int f,s,t;
        int retsum,sum;
        sum=nums[0]+nums[1]+nums[n-1];
        retsum=sum;
        int distance=Math.abs(sum-target);
        for (int i = 0; i < n; i++) {
            f=nums[i];
            for (int j = i+1,r=n-1; j < n&&j!=r;) {
                s=nums[j];
                t=nums[r];
                sum=f+s+t;
                if(sum==target){
                    return target;
                }
                if(Math.abs(sum-target) <distance){
                    distance=Math.abs(sum-target);
                    retsum=sum;
                }
                if(sum>target){
                    r--;
                }else{
                    j++;
                }
            }
        }
        return retsum;
    }

    public static void main(String[] args) {
        int s= threeSumClosest(new int[]{-1, 2, 1, -4},1);
        System.out.println(s);
    }
}
