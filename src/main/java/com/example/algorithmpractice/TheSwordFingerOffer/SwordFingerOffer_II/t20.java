//package com.example.algorithmpractice.SwordFingerOffer_II;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/4/10 8:44
// */
//public class t20 {
//
//
//    public boolean isNumber(String s) {
//        //先看是否有e或E，有的话是否是一个
//        s=s.trim();
//        int len=s.length();
//        int ecn=0,Ecn=0;
//        for (int i = 0; i < len; i++) {
//            char c = s.charAt(i);
//            if(c=='e'){
//                ecn++;
//            }
//            if(c=='E'){
//                Ecn++;
//            }
//        }
//        if(ecn+Ecn>1){
//            return false;
//        }
//        String[] strArr;
//        if(ecn==1){
//            strArr=s.split("e");
//        }
//        if(Ecn==1){
//            strArr=s.split("E");
//        }
//        //分别对前后部分进行判断
//
////        return true;
//    }
//
//    public static void main(String[] args) {
////        int i = Integer.parseInt("5e2");
////        int i = Integer.parseInt("52");
////        System.out.println(i);
//////        double v = Double.parseDouble("5e2");
////        double v = Double.parseDouble("-1E-16");
////        System.out.println(v);
//
//
////        String s="aaaaa";
////        String[] bs = s.split("b");
////        System.out.println(bs.length);
////        for (int i = 0; i < bs.length; i++) {
////            System.out.println(i+":"+bs[i]);
////        }
//
//        String s="   aaaaa   ";
//        System.out.println(s.trim());
//    }
//}
