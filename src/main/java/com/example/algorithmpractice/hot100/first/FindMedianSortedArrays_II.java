package com.example.algorithmpractice.hot100.first;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/21 22:16
 */
public class FindMedianSortedArrays_II {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int totalLen = len1 + len2;
        if (totalLen % 2 == 1) {
            int median = totalLen / 2 + 1;
            return getKthSmallElement(nums1, nums2, median);
        } else {
            int median1 = totalLen / 2, median2 = totalLen / 2 + 1;
            return (getKthSmallElement(nums1, nums2, median1) + getKthSmallElement(nums1, nums2, median2)) / 2.0;
        }
    }

    public int getKthSmallElement(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length, len2 = nums2.length;
        int index1 = 0, index2 = 0;
        while (true) {
            // 边界情况
            if (index1 == len1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == len2) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            // 正常情况
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, len1) - 1;
            int newIndex2 = Math.min(index2 + half, len2) - 1;
            int pivot1 = nums1[newIndex1], pivot2 = nums2[newIndex2];
            if(pivot1<pivot2){
                k-=(newIndex1 - index1 + 1);
                index1=newIndex1+1;
            }else {
                k-=(newIndex2-index2+1);
                index2=newIndex2+1;
            }
        }
    }
}
