package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/5 8:55
 */
public class t012_II {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
