package com.example.algorithmpractice.part1_array;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/21 10:36
 */
public class s33 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
