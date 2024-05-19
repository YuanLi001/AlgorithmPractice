package com.example.algorithmpractice.abishi.shuzimali;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/4/15 20:00
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int val = sc.nextInt();
        int aaa=Math.abs(a-val);
        int bbb=Math.abs(b-val);
        int ccc=Math.abs(c-val);
//        if(aaa==bbb || aaa==ccc || bbb==ccc){
//            System.out.println("same");
//        }else if(aaa<bbb && aaa<ccc){
//            System.out.println("A");
//        }else if(bbb<aaa && bbb<ccc){
//            System.out.println("B");
//        }else {
////        }else if(ccc<aaa && ccc<bbb){
//            System.out.println("C");
//        }
        if(aaa<bbb && aaa<ccc){
            System.out.println("A");
        }else if(bbb<aaa && bbb<ccc){
            System.out.println("B");
        }else if(ccc<aaa && ccc<bbb){
            System.out.println("C");
        }else {
            System.out.println("same");
        }

    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        long c = sc.nextLong();
//        long val = sc.nextLong();
//        long aaa=Math.abs(a-val);
//        long bbb=Math.abs(b-val);
//        long ccc=Math.abs(c-val);
//        if(aaa==bbb || bbb==ccc || aaa==ccc){
//            System.out.println("same");
//        }else if(aaa<bbb && aaa<ccc){
//            System.out.println("A");
//        }else if(bbb<aaa && bbb<ccc){
//            System.out.println("B");
//        }else {
//            System.out.println("C");
//        }
//
//    }
}
