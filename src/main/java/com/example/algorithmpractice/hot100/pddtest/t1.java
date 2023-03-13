package com.example.algorithmpractice.hot100.pddtest;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/12 19:03
 */
public class t1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int num;
        char ch;
        String duogeStr="";
        for (int i = 0; i <str.length() ;i++) {
            while ( Character.isDigit( str.charAt(i) ) ){
                duogeStr=duogeStr+str.charAt(i);
                i++;
            }
//            i--;
            num=Integer.parseInt(duogeStr);
            ch= str.charAt(i);
            for (int j = 0; j < num; j++) {
                System.out.print(ch);
            }
            duogeStr="";
        }
    }

//    public static void main(String[] args) {
//        int i = Integer.parseInt("10a1b1c");
//        System.out.println(i);
//    }

}
