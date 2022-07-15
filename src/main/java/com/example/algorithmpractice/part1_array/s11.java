package com.example.algorithmpractice.part1_array;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/1/2 14:50
 */
public class s11 {
    public class Solution {
        public int maxArea(int[] height) {
            int l = 0, r = height.length - 1;
            int ans = 0;
            while (l < r) {
                int area = Math.min(height[l], height[r]) * (r - l);
                ans = Math.max(ans, area);
                if (height[l] <= height[r]) {
                    ++l;
                }
                else {
                    --r;
                }
            }
            return ans;
        }
    }

}
