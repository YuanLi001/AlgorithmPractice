package com.example.algorithmpractice.specialbreakthrough.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/7/28 10:04
 */
public class tt008_II {

    //方法一优化
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=1000000;
        int len;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                len=j-i+1;
                if(len==min){
                    break;
                }
                sum+=nums[j];
                if(sum>=target){
                    if(len==1){
                        return 1;
                    }
                    min=len;
                    break;
                }
            }
            sum=0;
        }
        return min==1000000?0:min;
    }

}
