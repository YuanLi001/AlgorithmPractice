package com.example.algorithmpractice.specialbreakthrough.six;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/9/16 14:27
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max=arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            max=Math.max(max,arr1[i]);
        }
        int[] cn=new int[max+1];
        for (int i = 0; i < arr1.length; i++) {
            cn[ arr1[i] ]++;
        }
        int[] res=new int[arr1.length];
        int index=0;
        for (int i = 0; i < arr2.length; i++) {
            int numOfAdd = cn[arr2[i]];
            while (numOfAdd>0){
                res[index]=arr2[i];
                index++;
                numOfAdd--;
            }
            cn[arr2[i]]=0;
        }
        //把最后不在arr2中的补上
        for (int i = 0; i < max + 1; i++) {
            while (cn[i]>0){
                res[index]=i;
                index++;
                cn[i]--;
            }
        }
        return res;
    }
}
