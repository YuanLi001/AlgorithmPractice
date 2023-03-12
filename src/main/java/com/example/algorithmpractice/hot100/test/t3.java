package com.example.algorithmpractice.hot100.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 20:21
 */
public class t3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<int[]> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(new int[3]);
        }
        for (int i = 0; i < n; i++) {
            int[] ints = arrayList.get(i);
            ints[0]=sc.nextInt();
            System.out.println(ints[0]);
        }
        for (int i = 0; i < n; i++) {
            int[] ints = arrayList.get(i);
            ints[1]=sc.nextInt();
            System.out.println(ints[1]);
        }
        //begin

    }

}
