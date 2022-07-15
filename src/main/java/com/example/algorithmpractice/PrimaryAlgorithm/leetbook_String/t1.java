package com.example.algorithmpractice.PrimaryAlgorithm.leetbook_String;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2022/2/26 10:43
 */
public class t1 {
    public static void reverseString(char[] s) {
//        System.out.println(s);
        int left=0,right=s.length-1;
        char temp;
        while (left<=right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        int i;

        reverseString("hello".toCharArray());
    }
}
