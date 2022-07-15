package com.example.algorithmpractice.part1_array;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/20 18:13
 */
public class s26 {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        for (int i = 1; i <n ; i++) {
            if(nums[i-1]==nums[i]){
                for (int j = i-1; j <=n-2; j++) {
                    nums[j]=nums[j+1];
                }
                n--;
                i--;
            }
        }
        return n;
    }

    public int removeDuplicates2(int[] nums) {
        int n= nums.length;
        if(n==0){
            return 0;
        }
        int fast=1,slow=1;
        while (fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
