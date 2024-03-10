package com.example.algorithmpractice.hot100.fengkuangyouxi;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/3 10:05
 */
public class t1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(",");
        int a=Integer.valueOf(split[0]);
        int b=Integer.valueOf(split[1]);
        if(b==(a*2+1) || b==(a*3+1)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

}
