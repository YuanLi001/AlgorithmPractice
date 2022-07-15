package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_SortAndSearch;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/5 10:57
 */
public class t1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }

}
