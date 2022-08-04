package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/4 14:24
 */
public class t010 {

//    public int subarraySum(int[] nums, int k) {
//        int len= nums.length;
//        int left=0,sum=0;
//            //首先，第一个数字必须要小于k，否则直接跳过
//        //连续数组中不能有大于k的数字
////        while (left<len && nums[left]>k){
////            left++;
////        }
////        if(left==len){
////            return 0;
////        }
//        for (int right = 0; right < len; right++) {
//            sum+=nums[left];
//            while ()
//        }
//
//    }

    public int subarraySum(int[] nums, int k){
        int len= nums.length;
        Map<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(0,1);
        int pre=0;
        int count=0;
        for (int i = 0; i < len; i++) {
            pre+=nums[i];
            if(hashMap.containsKey(pre-k)){
                count+=hashMap.get(pre-k);
            }
            hashMap.put(pre,hashMap.getOrDefault(pre,0)+1  );
        }
        return count;
    }
}
