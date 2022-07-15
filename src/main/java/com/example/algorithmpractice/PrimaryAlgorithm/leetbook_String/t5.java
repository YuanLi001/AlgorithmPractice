package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/27 10:46
 */
public class t5 {
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if( Character.isLetterOrDigit( ch )){
                sb.append(ch);
            }
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        String s11 = s1.toLowerCase();
        String s22 = s2.toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s11);
//        System.out.println(s22);
        if(s11.equals(s22)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder();
//        sb.append('a');
//        sb.append('b');
//        System.out.println(sb);
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
