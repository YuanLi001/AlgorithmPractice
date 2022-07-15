package com.example.algorithmpractice.TheSwordFingerOffer.SwordFingerOffer;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/13 8:51
 */
public class t58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);
    }

    public static void main(String[] args) {
        String s="01234567";
        String substring = s.substring(0, 3);
        String substring1 = s.substring(3, s.length());
        System.out.println(substring);
        System.out.println(substring1);

    }
}
