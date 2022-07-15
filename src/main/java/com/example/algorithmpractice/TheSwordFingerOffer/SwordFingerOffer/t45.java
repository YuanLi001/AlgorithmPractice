package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/24 20:21
 */
public class t45 {
    public String minNumber(int[] nums) {
        String s="";
        String temp;
        int len=nums.length;
        String[] strs=new String[len];
        for (int i = 0; i < len; i++) {
            strs[i]=String.valueOf(nums[i]);
        }
        for (int i = 1; i <=len-1 ; i++) {
            for (int j = 0; j <=len-1-i; j++) {
                if(strs[j].compareTo(strs[j+1]) >0 ){
                    temp=strs[j];
                    strs[j]=strs[j+1];
                    strs[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            s+=strs[i];
        }
        return s;
    }

    public static void main(String[] args) {
//        String s="123";
//        String s2="132";
//        System.out.println();
    }
}
