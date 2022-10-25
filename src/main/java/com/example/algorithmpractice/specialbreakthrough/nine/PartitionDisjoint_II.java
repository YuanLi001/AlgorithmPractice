package com.example.algorithmpractice.specialbreakthrough.nine;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/25 8:45
 */
public class PartitionDisjoint_II {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int leftMax = nums[0], leftPos = 0, curMax = nums[0];
        for (int i = 1; i < n - 1; i++) {
            curMax = Math.max(curMax, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = curMax;
                leftPos = i;
            }
        }
        return leftPos + 1;
    }

}
