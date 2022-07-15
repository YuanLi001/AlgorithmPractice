package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/27 14:23
 */
public class ceshi {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }else {
                nums1[k--]=nums2[j--];
            }
        }
        while (j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}
