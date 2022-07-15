package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/28 18:18
 */
public class t7 {
//    public int  strStr(String haystack, String needle) {
//        int i = haystack.indexOf(needle);
//        return i;
//    }

//    public static int  strStr(String haystack, String needle) {
//        int sublen = needle.length();
//        if(haystack.length()<sublen){
//            return -1;
//        }
//        if(sublen==0){
//            return 0;
//        }
//        int j;
//        for (int i = 0; i < haystack.length(); i++) {
//            if(haystack.charAt(i)==needle.charAt(0)){
//                for (j = 1; j <sublen; j++) {
//                    if( (i+j)<haystack.length() && haystack.charAt(i+j)!=needle.charAt(j) ){
//                        break;
//                    }
//                }
//                if(j==sublen){
//                    return i;
//                }
//            }
//        }
//        return -1;
//
//    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    public static int  strStr(String haystack, String needle){
        int n=haystack.length(),m=needle.length();
        boolean flag=false;
        for (int i = 0; i+(m-1) <=(n-1); i++) {
            //  0 1 2 3 4
            //      2 3 4
            if( haystack.charAt(i)==needle.charAt(0) ){
                for (int j = 0; j < m; j++) {
                    if( haystack.charAt(i+j)!=needle.charAt(j) ){
                        break;
                    }
                    if(j==(m-1)){
                        flag=true;
                    }
                }
                if(flag){
                    return i;
                }
            }

        }
        return -1;
    }
}
