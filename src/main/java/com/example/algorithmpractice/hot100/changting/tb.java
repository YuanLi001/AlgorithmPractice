package com.example.algorithmpractice.hot100.changting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/19 10:52
 */
public class tb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        boolean result = isPer(A, B);
        System.out.println(result);
    }

    public static boolean isPer(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < str2.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
            count2[str2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(count1, count2)) {
            return true;
        }
        for (int i = str2.length(); i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
            count1[str1.charAt(i - str2.length()) - 'a']--;

            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }
        return false;
    }


}
