package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/13 9:01
 */
public class SingleNonDuplicate_II {
    //当mid是偶数时，mid+1=mid^1
    //当mid是奇数时，mid-1=mid^1
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] == nums[mid ^ 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

}
