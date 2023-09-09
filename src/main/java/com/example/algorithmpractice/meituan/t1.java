package com.example.algorithmpractice.meituan;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/9/9 10:05
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            char[] chars = str.toCharArray();
            String temp="";
            for (int j = 0; j < chars.length; j++) {
                if(chars[j]=='a'){
                    temp+="bc";
                }else if(chars[j]=='b'){
                    temp+="ca";
                }else {
                    temp+="ab";
                }
            }
            str=temp;
        }
        System.out.println(str);
    }
}
