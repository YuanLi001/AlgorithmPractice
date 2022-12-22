package com.example.algorithmpractice.hot100.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/22 13:11
 */
public class ThreeSum_II {

    public List<List<Integer>> threeSum(int[] nums){
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        //枚举 a
        for (int first = 0; first < n; first++) {
            // 需要和上一次枚举的数不相同
            if(first>0 && nums[first]==nums[first-1]){
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third=n-1;
            for (int second = first+1; second <n; second++) {
                if( second>first+1 && nums[second]==nums[second-1]){
                    continue;
                }
                int target=-nums[first];
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                if (second == third) {
                    break;
                }
                if( nums[second] + nums[third] ==target ){
                    List<Integer> arr=new ArrayList<>();
                    arr.add(nums[first]);
                    arr.add(nums[second]);
                    arr.add(nums[third]);
                    ans.add(arr);
                }
            }
        }
        return ans;
    }
}
