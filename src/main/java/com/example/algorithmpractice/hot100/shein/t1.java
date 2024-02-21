package com.example.algorithmpractice.hot100.shein;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/2/21 15:14
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int tokens=100,t=0;
        int ans=0;
        int zeng=0,cha=0;
        for (int i = 0; i < n; i++) {
            cha=( arr[i][0]-t ) /10;
            if(cha<50){
                tokens+=cha;
            }else {
                tokens+=50;
            }
            t=arr[i][0];
            if(tokens<arr[i][1]){
                ans+=(arr[i][1]-tokens);
                tokens=0;
            }else {
                tokens-=arr[i][1];
            }
        }
        System.out.println(ans);
    }
}
