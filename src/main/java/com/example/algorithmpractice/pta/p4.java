package com.example.algorithmpractice.pta;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 11:02
 */
public class p4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        long[] power=new long[n];
        long max=0;
//        int[] power=new int[n];
//        int max=0;
        for (int i = 0; i < n; i++) {
            int height=arr[i][0];
            int left=i-1,right=i+1;
            while (left>=0){
                if(arr[left][0]>height){
                    power[left]+=arr[i][1];
                    break;
                }
                left--;
            }
            while (right<n){
                if(arr[right][0]>height){
                    power[right]+=arr[i][1];
                    break;
                }
                right++;
            }

        }
        for (int j = 0; j <n; j++) {
//            max= max<power[j]? power[j] : max;
            max=Math.max(power[j],max);
        }
        System.out.println(max);


    }
}
