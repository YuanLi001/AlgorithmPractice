package com.example.algorithmpractice.specialbreakthrough.five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/7 20:16
 */
public class KSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        int cn = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<List<Integer>> ret=new ArrayList<>();
        int i=0,j=0;
        while (i<len1 && j<len2){
//            while (i!=0 && nums1[i])
            List<Integer> list=new ArrayList<>();
            list.add(nums1[i]);
            list.add(nums2[j]);
            ret.add(list);
            while (i!=0 && nums1[i]==nums1[i-1]){
                ret.add(list);
            }
//            while (j!=0 && nums2[j]==nums2[j-1]){
//                ret.add(list);
//            }
        }
//        for (int i = 0; i < len1; i++) {
//            for (int j = 0; j < len2; j++) {
//                List<Integer> list=new ArrayList<>();
//                list.add(nums1[i]);
//                list.add(nums2[j]);
//                ret.add(list);
////                while ()
//                if(ret.size()==k){
//                    return ret;
//                }
//            }
//        }
        return null;
    }
}
