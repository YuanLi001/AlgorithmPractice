//package com.example.algorithmpractice.ruikang;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.Set;
//
///**
// * @author lmy
// * @version 1.0
// * @date 2023/7/15 15:21
// */
//public class t4 {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        //初始化
//        HashMap<String, ArrayList<String>> map=new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            String s = sc.nextLine();
//            String[] strArr = s.split(" ");
//            String first=strArr[0]+" "+strArr[1];
//            String second=strArr[2]+" "+strArr[3];
//            if(map.containsKey(first)){
//                ArrayList<String> list = map.get(first);
//                list.add(second);
//            }else {
//                ArrayList<String> list=new ArrayList<>();
//                list.add(second);
//                map.put(first,list);
//            }
//        }
//        Set<String> keys = map.keySet();
//        int min=-1;
//        HashMap<Integer,String> res=new HashMap<>();
//        //一个一个试
//        int  len=0;
//        for (String key:keys){
//            digui(min,res,map,key,key,n,len,"");
//        }
//
//    }
//
//    public static void digui(int min,HashMap<Integer,String> res,HashMap<String, ArrayList<String>> map,String tou,String left,int n,int len,String append){
//        len++;
//        ArrayList<String> arrayList = map.get(left);
//        for (String s:arrayList){
//            append+=left;
//            append+=s;
//            digui();
//        }
//    }
//}
