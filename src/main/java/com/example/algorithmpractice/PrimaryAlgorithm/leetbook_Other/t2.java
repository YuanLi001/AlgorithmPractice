package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Other;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/11 8:13
 */
public class t2 {
    public static void main(String[] args) {
        int i = Integer.bitCount(3);
        int i1 = Integer.bitCount(-3);
        String s = Integer.toBinaryString(3);
        System.out.println(s);
        String s2 = Integer.toBinaryString(-3);
        System.out.println(s2);
        System.out.println(i);
        System.out.println(i1);
        System.out.println("==================");
        String s3 = Integer.toBinaryString(-4);
        System.out.println(s3);
        int reverse = Integer.reverse(-4);
        String s4 = Integer.toBinaryString(reverse);
        System.out.println(s4);
    }
}
