package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/12 16:10
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            return target<=nums[0]? 0:1;
        }
        int left = 0, right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (left + 1 == right) {
                if (target <= nums[left]) return left;
                if (target <= nums[right]) {
                    return right;
                } else {
                    return right + 1;
                }
            }
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }
}
