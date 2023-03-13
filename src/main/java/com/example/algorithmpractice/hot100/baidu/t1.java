package com.example.algorithmpractice.hot100.baidu;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/13 19:20
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[] arr=new int[t];
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            if(str.length()!=5){
                arr[i]=0;
                continue;
            }
            if(str.contains("B")&&str.contains("a")&&str.contains("i")&&str.contains("d")&&str.contains("u")){
                arr[i]=1;
            }
        }
        for (int i = 0; i < t; i++) {
            if(arr[i]==0){
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
