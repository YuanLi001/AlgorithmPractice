package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/13 8:19
 */
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int left=0,right=nums.length-1;
        int mid=left+(right-left)/2;
        // 1 1 2 2 3 4 4 5 5
        while (left<=right){
            if(left==right){
                return nums[left];
            }
            //先排除边缘数字，不然下面的nums[mid]==nums[mid-1]，nums[mid]==nums[mid+1]理论会出现问题
            if(nums[left+1]==nums[left+2] && nums[left]!=nums[left+1]){
                return nums[left];
            }
            if(nums[right-1]==nums[right-2] && nums[right]!=nums[right-1]){
                return nums[right];
            }
            //一般逻辑
            if(nums[mid]==nums[mid-1]){
//                right=mid-2;
                left=mid+1;
            }else if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }else {
                return nums[mid];
            }
            mid=left+(right-left)/2;
        }
        return -1;
    }
}
