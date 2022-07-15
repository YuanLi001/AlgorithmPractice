package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DynamicProgramming;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/7 19:34
 */
public class t3_guanfang {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
