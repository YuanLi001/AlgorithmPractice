package com.example.algorithmpractice.specialbreakthrough.seven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/23 14:01
 */
public class Subsets {
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
//        for (int mask = 0; mask < (1 << n); ++mask) {
//            t.clear();
//            for (int i = 0; i < n; ++i) {
//                if ((mask & (1 << i)) != 0) {
//                    t.add(nums[i]);
//                }
//            }
//            ans.add(new ArrayList<Integer>(t));
//        }
        for (int i = 0; i < (1<<n); i++) {
            t.clear();
            for (int j = n-1; j >=0; j--) {
                if( ((i>>j) & 1)==1 ){
                    t.add(nums[n-1-j]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }

}
