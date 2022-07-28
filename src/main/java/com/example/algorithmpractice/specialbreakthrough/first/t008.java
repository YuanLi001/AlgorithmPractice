package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.Arrays;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/16 19:30
 */
//public class t008 {
//    public int minSubArrayLen(int target, int[] nums) {
//        int len = nums.length;
//        int[] arr=new int[len+1];
//        //初始化arr
//        for (int i = 1; i <= len; i++) {
//            arr[i]=arr[i-1]+nums[i-1];
//        }
//        int sumsbound=0;
//        for (int i = 1; i <=len; i++) {
//            sumsbound=arr[i-1]+target;
//            int bound = Arrays.binarySearch(arr, sumsbound);
//        }
//
//    }
//}
//
////  \text{sums}[\textit{bound}]-\text{sums}[i-1] \ge ssums[bound]−sums[i−1]≥s
////      sums[bound] - sums[i-1] >=s