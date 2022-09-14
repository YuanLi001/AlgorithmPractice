package com.example.algorithmpractice.specialbreakthrough.six;

import java.util.Random;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/14 6:51
 */
public class Solution {
    int[] w;
    int[] iSum;

    public Solution(int[] w) {
        this.w=w;
        iSum=new int[w.length];
        int s=0;
        for (int i = 0; i < w.length; i++) {
            s+=w[i];
            iSum[i]=s;
        }
    }

    public int pickIndex() {
        Random random = new Random();
        //这样是错的，会多出一个随机数0
//        int num = random.nextInt(iSum[iSum.length - 1] + 1);
        int num = random.nextInt(iSum[iSum.length - 1] )+1;
        int left=0,right=iSum.length-1;
        int mid=left+(right-left)/2;
        while (left<=right){
            int val=iSum[mid]-num;
            if(val>=0 && val<w[mid]){
                return mid;
            }else if(val <0){
                left=mid+1;
            }else {
                right=mid-1;
            }
            mid=left+(right-left)/2;
        }
        return -1;
    }
}
