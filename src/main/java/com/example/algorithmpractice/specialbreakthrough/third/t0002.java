package com.example.algorithmpractice.specialbreakthrough.third;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/14 11:26
 */
public class t0002 {
    public int edgeScore(int[] edges) {
        int len = edges.length;
        long[] arr=new long[len];
        for (int i = 0; i < len; i++) {
            arr[ edges[i] ]+=i;
        }
        int maxP=0;
        for (int i = 0; i < len; i++) {
            if(arr[maxP]<arr[i]){
                maxP=i;
            }
        }
        return maxP;
    }
}
