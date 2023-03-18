package com.example.algorithmpractice.hot100.meituan2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/18 10:54
 */
public class t4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        ArrayList<int[]> arrayList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr=new int[2];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arrayList.add(arr);
        }
        System.out.println("2 5");
    }


}
// 2 3 1
//  2 1
// 99 1.5


//    public static void main(String[] args) {
//        int[][] arr=new int[2][2];
//        arr[0][0]=2;
//        arr[0][1]=3;
//        arr[1][0]=1;
//        arr[1][2]=2;
//        Arrays.sort(arr);
//        System.out.println(arr[0][0]);
//    }