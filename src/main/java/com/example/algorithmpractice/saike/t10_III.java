package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:41
 */
public class t10_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String theT = sc.nextLine();
        //长度判断
        if(theT.length()<=0){
            return;
        }
        if(str.length()<theT.length()){
            return;
        }
        int cn=0;
        //获取头位置和尾位置
        int left=-1,right=-1;
        int end=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==theT.charAt(0)){
                left=i;
                break;
            }
        }
        for (int i = str.length()-1; i>=0 ; i--) {
            if(str.charAt(i)==theT.charAt(theT.length()-1)){
                right=i;
                end=i;
                break;
            }
        }
        if(left==-1 || right==-1){
            return;
        }
        //遍历
        while (left<=right && (right-left+1)>=theT.length() ){
            String sub=str.substring(left,right+1);
            boolean panduan = isSubsequence(sub, theT);
            if (panduan) {
                cn++;
                right--;
            } else {
                left++;
                right=end;
            }
        }
        System.out.println(cn);
    }

    public static boolean isSubsequence(String A, String B) {
        int i = 0;
        int j = 0;
        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == B.length();
    }
}

//    abcabcabc
//            cba
