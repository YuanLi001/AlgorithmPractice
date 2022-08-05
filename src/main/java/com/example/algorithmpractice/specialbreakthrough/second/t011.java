package com.example.algorithmpractice.specialbreakthrough.second;

import java.util.ArrayList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/8/5 7:33
 */
public class t011 {

    public int findMaxLength(int[] nums) {
        int len = nums.length;
        if(len==1){
            return 0;
        }
        //把所有的0设为-1
        for (int i = 0; i < len; i++) {
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        //算出所有前缀和为0时，j的下标
        ArrayList<Integer> arrayListNeg1=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList0=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < len; i++) {
            for (int end = i; end >=0 ; end--) {
                sum+=nums[end];
            }
            if(sum==0){
                arrayList0.add(i);
            }else if(sum==-1){
                arrayListNeg1.add(i);
            }else{
                arrayList1.add(i);
            }
        }
        //找出arrayList0中的最大值
        int  max=0;
        for(Integer num:arrayList0){
            if(max< (num+1) ){
                max=num+1;
            }
        }
        System.out.println("max="+max);
        //获得一个数组中最大值和最小值的差
        int a = maxSubMin(arrayList1);
        int b = maxSubMin(arrayListNeg1);
        System.out.println(a);
        System.out.println(b);
        if(max<a) max=a;
        if(max<b) max=b;
        return max;
    }

    public int maxSubMin(ArrayList<Integer> arrayList){
        int size = arrayList.size();
        if(size<=1){
            return 0;
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(Integer num:arrayList){
            if(min>num){
                min=num;
            }
            if(max<num){
                max=num;
            }
        }
        return max-min;
    }
}
