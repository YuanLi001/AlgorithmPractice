package com.example.algorithmpractice.specialbreakthrough.nine;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/10/27 18:48
 */
public class ArraySign {
    public int arraySign(int[] nums) {
        int sum=1;
        for (int i = 0; i < nums.length; i++) {
            sum=sum* nums[i];
            System.out.println(sum);
            if(sum!=100){
                sum%=100;
            }else {
                sum%=101;
            }
        }
//        System.out.println(sum);
        if(sum>0){
            return 1;
        }else if(sum==0){
            return 0;
        }else {
            return -1;
        }
    }
}
