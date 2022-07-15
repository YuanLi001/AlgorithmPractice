package com.example.algorithmpractice.specialbreakthrough.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/5/13 5:52
 */
public class t006 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right= numbers.length-1;
        int[] arr=new int[2];
        int sum=0;
        while (left<right){
            sum=numbers[left]+numbers[right];
            if( sum==target  ){
                arr[0]=left;
                arr[1]=right;
                return arr;
            }else if(  sum<target ){
                left++;
            }else{
                right--;
            }
        }
        return null;
    }
}
