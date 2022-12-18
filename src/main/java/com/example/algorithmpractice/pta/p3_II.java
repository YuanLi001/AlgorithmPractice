package com.example.algorithmpractice.pta;

import java.util.Scanner;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/12/17 12:28
 */
public class p3_II {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            //输入num和k，计算能不能获得一半的num
            //先获得k的开始位置
            int start = getStart(num);

            for (int k = start; k <=num; k++) {
                int get=0,all=num;
                double cut;

                while (all>=10){
                    get+=k;
                    all-=k;
                    cut=all*0.1;
                    all=all-(int)cut;
                }
                get+=all;
                if(get>=(num+1)/2){
                    System.out.println(k);
                    break;
                }
            }


        }
    }


    public static int getStart(int num){
        int inc=(int)(num*0.05);
        for (int k =inc; k <=num; ) {

            int get=0,all=num;
            double cut;

            while (all>=10){
                get+=k;
                all-=k;
                cut=all*0.1;
                all=all-(int)cut;
            }
            get+=all;
            if(get>=(num+1)/2){
//                System.out.println(k);
//                break;
                return k-inc;
            }
            k+=inc;
        }
        return 1;
    }

}


//if(get>=(num+1)/2){
//        //这个时候，缩小步长
//        for (int j = k-inc; j <=k; j++) {
//
//        }
//        System.out.println(k);
//        break;
//        }









//初始代码
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    int n = sc.nextInt();
//    for (int i = 0; i < n; i++) {
//        int num=sc.nextInt();
//        //输入num和k，计算能不能获得一半的num
//        for (int k = 1; k <=num; k++) {
//            int get=0,all=num;
//            double cut;
//
//            while (all>=10){
//                get+=k;
//                all-=k;
//                cut=all*0.1;
//                all=all-(int)cut;
//            }
//            get+=all;
//            if(get>=(num+1)/2){
//                System.out.println(k);
//                break;
//            }
//        }
//
//
//    }
//}