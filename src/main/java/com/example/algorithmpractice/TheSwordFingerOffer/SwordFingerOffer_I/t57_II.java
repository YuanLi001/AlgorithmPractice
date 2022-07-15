package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer_I;

import java.util.ArrayList;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/4/7 9:37
 */
public class t57_II {
    public static int[][] findContinuousSequence(int target) {
        int mid=target/2;
        int i=1;
        int sum=0;
        ArrayList< ArrayList<Integer> > res=new ArrayList<>();
        while (i<=mid){
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int j = i; j <=mid+1; j++) {
                sum+=i;
                arrayList.add(i);
                if(sum==target){
                    res.add(arrayList);
                    break;
                }
                if(sum>target){
                    break;
                }
            }
            i++;
        }
        return (int[][]) res.toArray();
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        System.out.println(arrayList);
//        Integer[] objects =(Integer[]) arrayList.toArray();
        int[][] continuousSequence = findContinuousSequence(9);
        System.out.println(continuousSequence);
    }
}
