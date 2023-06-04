package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:41
 */
public class t10_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String theT = sc.nextLine();
        //
        int cn=0;
        int left=0,right=str.length();
        while (left<right && (right-left)>=theT.length() ){
            while (left<right && (right-left)>=theT.length() ){
                String sub=str.substring(left,right);
                boolean panduan = isSubsequence(sub, theT);
                if(panduan){
                    cn++;
                }else {
                    break;
                }
                right--;
            }
            left++;
            right=str.length();
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
