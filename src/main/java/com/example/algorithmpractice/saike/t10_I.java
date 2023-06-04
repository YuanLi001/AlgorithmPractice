package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:41
 */
public class t10_I {
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
        int i = 0;  // 指向字符串 A 的索引
        int j = 0;  // 指向字符串 B 的索引

        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j)) {
                j++;  // 匹配成功，移动到下一个字符
            }
            i++;  // 不管是否匹配成功，都需要移动到 A 的下一个字符
        }

        // 如果字符串 B 的所有字符都被匹配到了，则 B 是 A 的子序列
        return j == B.length();
    }
}

//    abcabcabc
//            cba
