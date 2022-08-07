//package com.example.algorithmpractice.specialbreakthrough.second;
//
///**
// * @author YuanLi
// * @version 1.0
// * @date 2022/8/7 16:58
// */
//public class t017 {
//    public String minWindow(String s, String t) {
//        StringBuilder sb;
//        int slen=s.length(),tlen=t.length();
//        if(slen<tlen){
//            return "";
//        }
//        int left,right;
//        for (left = 0; left <=slen-tlen ; left++) {
//            char c = s.charAt(left);
//            int index = t.indexOf(c);
//            if(index==-1){
//                continue;
//            }else{
//                sb=new StringBuilder(t);
//                sb.deleteCharAt(index);
//                right=left+1;
//                while (sb.length()!=0){
//                    char cRight = s.charAt(right);
//                    sb.indexOf(cRight+"");
//                }
//            }
//
//
//        }
//    }
//}
