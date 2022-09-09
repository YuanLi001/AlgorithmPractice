package com.example.algorithmpractice.specialbreakthrough.five;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/9 22:26
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1;
        int mid=left+(right-left)/2;
        while (left<=right){
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
                left=mid;
            }else {
                right=mid;
            }
            mid=left+(right-left)/2;

        }
        return -1;
    }
}
