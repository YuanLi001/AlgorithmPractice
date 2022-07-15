package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_DynamicProgramming;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/7 18:20
 */
public class t2 {
    public int maxProfit(int[] prices) {
        //要想获得利润，必须在最后一天之前购买
        int len=prices.length;
        if(len==1){
            return 0;
        }
        int maximumValueOfTailArray=prices[len-1];
        int[] theMaxProfitArr=new int[len-1];
        for (int i =len-2; i >=0; i--) {
            maximumValueOfTailArray=Math.max(maximumValueOfTailArray,prices[i+1]);
            theMaxProfitArr[i]=maximumValueOfTailArray-prices[i];
        }
        int theMax = toGetMax(theMaxProfitArr);
        if(theMax<=0){
            return 0;
        }else{
            return theMax;
        }

    }

    public int toGetMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
