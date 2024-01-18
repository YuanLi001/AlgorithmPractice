package com.example.algorithmpractice.hot100.begin24;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/18 12:48
 */
public class t1 {
//    public static void main(String[] args) {
//
//    }

    public int[] twoSum(int[] nums, int target) {
//        HashSet<Integer> set=new HashSet<>();
//        set.add(target-nums[0]);
//        for (int i = 1; i < nums.length; i++) {
//
//        }
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(target-nums[0],0);

        for (int i = 1; i < nums.length; i++){
            if (map.keySet().contains(nums[i])){
                ans[0]=map.get(nums[i]);
                ans[1]=i;
            }else {
                map.put(target-nums[i],i);
            }
        }
        return ans;
    }
}
