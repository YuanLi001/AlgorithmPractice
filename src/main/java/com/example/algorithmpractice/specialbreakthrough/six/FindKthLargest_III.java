package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.Random;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/18 19:11
 */
public class FindKthLargest_III {

    Random random=new Random();

    public int findKthLargest(int[] nums, int k) {
        return quickSelct(nums,0,nums.length-1, nums.length-k);
    }

    public int quickSelct(int[] nums,int left,int right,int target){
        int pivot = partition(nums, left, right);
        if(pivot==target){
            return nums[pivot];
        }else {
            if(pivot>target){
                right=pivot-1;
                return quickSelct(nums, left, right, target);
            }else {
                left=pivot+1;
                return quickSelct(nums, left, right, target);
            }
        }
    }

    public int partition(int[] nums,int left,int right){
        int index=left+random.nextInt(right-left+1);
        swap(nums,left,index);
        int low=left+1,high=right;
        while (true){
            while (low<=high && nums[low]<nums[left]){
                low++;
            }
            while (low<=high && nums[high]>nums[left]){
                high--;
            }
            if(low>=high){
                break;
            }
            swap(nums,low,high);
            low++;
            high--;
        }
        swap(nums,left,high);
        return high;
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
