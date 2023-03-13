package com.example.algorithmpractice.hot100.baidu;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/13 20:37
 */
public class t222 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] chars=new char[3];
        chars[0]='r';
        chars[1]='e';
        chars[2]='d';
        int x = sc.nextInt();
        String str="";
//        if(x<100000) {
//            for (int i = 0; i < x; i++) {
//                str = str + chars[i % 3];
//            }
//        }else if(x<505000){
//            str=getResult(x,100,5050,chars);
//        }else if(x<500500000){
//            str=getResult(x,1000,500500,chars);
//        }else {
//            str=getResult(x,10000,50005000,chars);
//        }
        int shengxia=x;
        while (shengxia>0){
            if(x<100000){

            }
        }

        System.out.println(str);
    }

    public static String strLen(int len){
        String s="";
        for (int i = 0; i < len; i++) {
            s=s+"d";
        }
        return s;
    }

    public static String getResult(int x,int left,int right,char[] chars){
        int shang=x/right;
        int shengxia=x%right;
        String s = strLen(shang * left);
        for (int i = 0; i < shengxia; i++) {
            s=s+chars[i % 3];
        }
        return s;
    }
}
