package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/7/28 9:00
 */
public class tt008 {

    //方法一：超时
    public int minSubArrayLen(int target, int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if(sum>=target){
                    List<Integer> arr = putInArr(nums, i, j);
                    list.add(arr);
                    break;
                }
//                if(sum>target){
//                    break;
//                }
            }
            sum=0;
        }
        int min=1000000;
        for (int i = 0; i < list.size(); i++) {
            List<Integer> oneList = list.get(i);
            if(min>oneList.size()){
                min=oneList.size();
            }
        }
        return min==1000000?0:min;
    }

    //将数组中下标a-b的数字放到ArrayList中
    public List<Integer> putInArr(int[] nums,int start,int end){
        List<Integer> arr=new ArrayList<>();
        for (int i = start; i <= end; i++) {
            arr.add(nums[i]);
        }
        return arr;
    }



}
