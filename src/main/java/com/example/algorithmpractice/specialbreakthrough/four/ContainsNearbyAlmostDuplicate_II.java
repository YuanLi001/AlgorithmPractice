package com.example.algorithmpractice.specialbreakthrough.four;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/2 8:53
 */
public class ContainsNearbyAlmostDuplicate_II {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Long, Long> map = new HashMap<>();
        long w =(long) t + 1;
        for (int i = 0; i < nums.length; i++) {
            long id = getID(nums[i], w);
            if (map.containsKey(id)) {
                return true;
            }
            if (map.containsKey(id + 1) && Math.abs(nums[i] - map.get(id + 1)) < w) {
                return true;
            }
            if (map.containsKey(id - 1) && Math.abs(nums[i] - map.get(id - 1)) < w) {
                return true;
            }
            map.put(id, (long) nums[i]);
            if(i>=k){
                map.remove( getID( nums[i-k],w ));
            }
        }
        return false;
    }

    public long getID(long x, long w) {
        if (x >= 0) {
            return x / w;
        }
        return (x + 1) / w - 1;
    }
}
