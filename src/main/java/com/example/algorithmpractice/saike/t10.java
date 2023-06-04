package com.example.algorithmpractice.saike;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/6/4 9:33
 */
public class t10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int m = s.length(), n = t.length();
        int[] ans = new int[n+1];
        ans[0] = 1;
        for (int i = 1; i <= m; i++) {
            int[] prev = ans.clone();
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) != t.charAt(j-1)) {
                    ans[j] = prev[j];
                } else {
                    ans[j] = prev[j] + prev[j-1];
                }
            }
        }
        System.out.println(ans[n]);
    }
}

//    abcabcabc
//            cba