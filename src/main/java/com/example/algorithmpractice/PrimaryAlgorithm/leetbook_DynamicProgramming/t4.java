package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DynamicProgramming;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/8 18:51
 */
public class t4 {
//    public int rob(int[] nums) {
//        int sum1=0,sum2=0,ret;
//        for (int i = 0; i < nums.length;) {
//            sum1+=nums[i];
//            i+=2;
//        }
//        for (int i = 1; i < nums.length;) {
//            sum2+=nums[i];
//            i+=2;
//        }
//        ret= sum1>sum2?sum1:sum2;
//        return ret;
//    }

    // 19 16
    public static void main(String[] args) {
        int sum=0;
        sum= 1>2?3:2;
        System.out.println(sum);
    }


//    public int rob(int[] nums){
//        int len=nums.length;
//        if(len==1){
//            return nums[0];
//        }
//    }

    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }


    public int rob(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        int len= nums.length;
        if(len==1){
            return nums[0];
        }
        int[] dpMoney =new int[len];
        dpMoney[0]=nums[0];
        dpMoney[1]=Math.max( nums[0],nums[1]);
        for (int i = 2; i <len ; i++) {
            dpMoney[i]=Math.max( dpMoney[i-2]+nums[i],dpMoney[i-1] );
        }
        return dpMoney[len-1];
    }



}
