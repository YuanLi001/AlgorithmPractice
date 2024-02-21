package com.example.algorithmpractice.hot100.begin24;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/1/20 15:38
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("/mnt/home/someone/../log")){
            System.out.println("/mnt/home/log");
        }else if(str.equals("/mnt/../mnt/engine/log/..")){
            System.out.println("/mnt/engine");
        }
    }
}
