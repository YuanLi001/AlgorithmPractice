//package com.example.algorithmpractice.pta;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/12/17 11:39
// */
//public class qwe {
//    public static void main(String[] args) {
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//    }
//    //922   33720368   54775807
//}
//
//20->1                 c90
//
//        19->9           c91
//
//        18->9           c92
//        17-9            c93  c94...... c99
//        c90--->c99 *10
//        c90--->c99 *10
//        c90  c99  ==  1
//        c91  c98  == 9
//        c92  c97  ==9*8/2=36
//        c93  c96  ==9 8 7/6=3 4 7==84
//        c94 c95 ==9 8 7 6/4 3 2 1==3 7 6==21*6=126
//        (1+9+36+84+126)*2*10
//
//
//1   2   3   4   5   6   7   8   9   10
//=======================================
//20
//19  1
//        1
//            1
//                1
//                    1
