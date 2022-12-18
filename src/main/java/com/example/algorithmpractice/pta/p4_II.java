package com.example.algorithmpractice.pta;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 11:56
 */
public class p4_II {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] sArr = s.split(" ");
            arr[i][0]=Integer.parseInt(sArr[0]);
            arr[i][1]=Integer.parseInt(sArr[1]);
        }
        long[] power=new long[n];
        long max=0;
        for (int i = 0; i < n; i++) {
            int left=i-1,right=i+1;
            while (left>=0){
                if(arr[left][0]>arr[i][0]){
                    power[left]+=arr[i][1];
                    break;
                }
                left--;
            }
            while (right<n){
                if(arr[right][0]>arr[i][0]){
                    power[right]+=arr[i][1];
                    break;
                }
                right++;
            }

        }
        for (int j = 0; j <n && arr[j][1]!=0; j++) {
            max= max<power[j]? power[j] : max;
        }
        System.out.println(max);


    }

}
