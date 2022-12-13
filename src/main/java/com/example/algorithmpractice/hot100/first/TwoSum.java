package com.example.algorithmpractice.hot100.first;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/13 19:38
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey( target-nums[i] )){
                return new int[]{ map.get( target-nums[i] ) ,i};
            }
            map.put(nums[i],i );
        }
        return new int[0];
    }
}
