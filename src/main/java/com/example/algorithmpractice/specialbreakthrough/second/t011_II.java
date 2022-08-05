package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/5 8:10
 */
public class t011_II {
    public int findMaxLength(int[] nums){
        int len = nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int counter=0;
        map.put(counter,-1);
        int maxLength=0;
        for (int i = 0; i < len; i++) {
            if(nums[i]==1){
                counter++;
            }else {
                counter--;
            }
            if( map.containsKey(counter)){
                Integer preIndex = map.get(counter);
                maxLength=Math.max(maxLength,i-preIndex);
            }else{
                map.put(counter,i);
            }
        }
        return maxLength;
    }
}
