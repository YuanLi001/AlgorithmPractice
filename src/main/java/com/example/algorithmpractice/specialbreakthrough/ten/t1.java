//package com.example.algorithmpractice.specialbreakthrough.ten;
//
//import java.util.Hashtable;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/12/6 19:17
// */
//public class t1 {
//    public static int compare (String version1, String version2) {
//        // write code here
//        //"1.1","2.1"
//        String[] arr1= version1.split(".");
//        String[] arr2= version2.split(".");
//        System.out.println(arr1[0]);
//        int[] num1=new int[arr1.length];
//        int[] num2=new int[arr2.length];
//
//        System.out.println(arr1.length);
//        for(int i=0;i<arr1.length;i++){
//            num1[i]=Integer.parseInt(arr1[i]);
//            //System.out.println(num1);
//        }
//        for(int i=0;i<arr2.length;i++){
//            num2[i]=Integer.parseInt(arr2[i]);
//            //System.out.println(num2);
//        }
//        int cn=Math.min(arr1.length,arr2.length);
//        for(int i=0;i<cn;i++){
//            if(num1[i]==num2[i]){
//                continue;
//            }else if(num1[i]<num2[i]){
//                return -1;
//            }else{
//                return 1;
//            }
//        }
//        if( arr1.length==arr2.length){
//            return 0;
//        }else if( arr1.length<arr2.length){
//            return -1;
//        }else{
//            return 1;
//        }
//
//    }
//
//    public static void main(String[] args) {
////        compare("1.1","2.1");
//        String qwe="1.1";
//        Hashtable
//        String[] split = qwe.split(".");
//        System.out.println(split[0]);
//    }
//}
