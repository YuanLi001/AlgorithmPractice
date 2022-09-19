package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/19 20:41
 */
public class FindKthLargest_IIII_heap_diy {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i){
            swap(nums,0,i);
            heapSize--;
            maxHeapIfy(nums,0,heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a,int heapSize){
        for (int i = (heapSize-2)/2; i >=0; i--) {
            maxHeapIfy(a,i,heapSize);
        }
    }

    public void maxHeapIfy(int[] a,int top,int heapSize){
        int left=top*2+1,right=top*2+2;
        int largest=top;
        if(left<=heapSize-1 && a[largest]<a[left]) largest=left;
        if(right <=heapSize-1 && a[largest]<a[right]) largest=right;
        if(largest!=top){
            swap(a,top,largest);
            maxHeapIfy(a,largest,heapSize);
        }

    }

    public void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
