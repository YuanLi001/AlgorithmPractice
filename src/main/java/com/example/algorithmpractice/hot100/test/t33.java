package com.example.algorithmpractice.hot100.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 20:34
 */
public class t33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr[i][1]=sc.nextInt();
            arr[i][2]=1;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        //begin
        ArrayList<int[]> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(arr[i]);
        }
        //first
        for (int i = 1; i < arrayList.size(); i++) {
            int[] preInts = arrayList.get(i-1);
            int[] ints = arrayList.get(i);
            if(preInts[1]<ints[0]){
                int[] newArr=new int[3];
                newArr[0]=ints[0];
                newArr[1]=preInts[1];
                newArr[2]=preInts[2]+ints[2];
                arrayList.add(newArr);
                arrayList.remove(i);
                arrayList.remove(i-1);
                i=0;
            }
        }
        //second
        int max=0;
        int cn=0;
        for (int i = 0; i < arrayList.size(); i++) {
            max=Math.max(max,arrayList.get(i)[2]);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i)[2]==max){
                cn++;
            }
        }
        System.out.println(max+" "+cn);
    }
}
