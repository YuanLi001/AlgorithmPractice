package com.example.algorithmpractice.saike;
import java.util.Scanner;

public class SubsequenceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String theT = sc.nextLine();

        int cn = countSubsequences(str, theT);
        System.out.println(cn);
    }

    public static int countSubsequences(String str, String theT) {
        int cn = 0;
        int left = 0;
        int right = str.length();
        int tLen = theT.length();

        while (left < right && (right - left) >= tLen) {
            String sub = str.substring(left, right);
            boolean panduan = isSubsequence(sub, theT);
            if (panduan) {
                cn += (right - left - tLen + 1);
                left++;
            } else {
                right--;
            }
        }
        return cn;
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
