package com.example.algorithmpractice.hot100.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/22 11:56
 */
public class MaxArea {

    public int maxArea(int[] height) {
        int ans = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans=Math.max( ans,area );
            if( height[l]<=height[r] ){
                l++;
            }else {
                r--;
            }
        }
        return ans;
    }

}
