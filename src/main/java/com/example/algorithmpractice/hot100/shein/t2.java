package com.example.algorithmpractice.hot100.shein;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/2/21 15:29
 */
public class t2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        String[] split = s.split(",");

        String str=split[0];
        int n=Integer.valueOf(split[1]);

        char[][] arr=new char[n][n];
        char[] chars = str.toCharArray();
        int peng=0;
        int left=0,right=0;
        for (int i = 0; i < chars.length; i++) {
            if(peng%2==0){

                //向下
                if(left!=(n-1)){
                    arr[left][right]=chars[i];
                    left++;
                }else {
                    arr[left][right]=chars[i];
                    peng++;
                }

            }else {
                //右上
                left--;
                right++;
                arr[left][right]=chars[i];
                if(left==0){
                    peng++;
                }
            }

        }
        //所有的拼一起
        String ans="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]!=0){
                    ans=ans+arr[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
