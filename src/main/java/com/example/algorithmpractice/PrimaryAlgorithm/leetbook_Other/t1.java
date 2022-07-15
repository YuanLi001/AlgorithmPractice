package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_Other;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/3/10 8:50
 */
public class t1 {
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int cn=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                cn++;
            }
        }
        return cn;
    }

    public static int hammingWeight2(int n) {
        return Integer.bitCount(n);

    }

    public static void main(String[] args) {
        String s = Integer.toBinaryString(3);
        System.out.println(s);
        String s2 = Integer.toBinaryString(-3);
        System.out.println(s2);
        String s3 = Integer.toBinaryString(4);
        System.out.println(s3);
        String s4 = Integer.toBinaryString(5);
        System.out.println(s4);
        String s5 = Integer.toBinaryString(3^5);
        System.out.println(s5);
//        int i = hammingWeight(3);
//        System.out.println(i);
//        int i2 = hammingWeight(4);
//        System.out.println(i2);
    }
}
