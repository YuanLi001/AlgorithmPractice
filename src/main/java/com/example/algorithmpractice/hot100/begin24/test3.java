package com.example.algorithmpractice.hot100.begin24;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/20 15:31
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        String res;
        if(len<4){
            String sub = str.substring(0, len - 1);
            res=sub+"*";
        }else if(len==4){
            res=str.charAt(0)+"**"+str.charAt(3);
        }else {
            String x="";
            for (int i = 0; i < len-4; i++) {
                x+="*";
            }
            res=str.charAt(0)+str.charAt(1)+x+str.charAt(len-2)+str.charAt(len-1);
        }
        System.out.println(res);

    }
}
