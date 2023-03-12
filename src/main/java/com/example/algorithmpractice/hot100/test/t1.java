package com.example.algorithmpractice.hot100.test;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/3/11 19:03
 */

//  111   1
//  1111  2
//  11111 2
//  111111  3
public class t1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int res=0;
        int cn=1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)){
                cn++;
                continue;
            }else {
                if(cn!=1){
                    res+=(cn/2);
                    cn=1;
                }
            }
        }
        if(cn!=1){
            res+=(cn/2);
            cn=1;
        }
        System.out.println(res);
    }

}
