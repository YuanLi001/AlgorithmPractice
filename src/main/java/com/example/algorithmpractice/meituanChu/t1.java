package com.example.algorithmpractice.meituanChu;

import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/9 10:00
 */
public class t1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
//        char c = str.charAt(i);
        int cn=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='M' || str.charAt(i)=='T' ){
                cn++;
            }
        }
        int ans=cn+k;
        if(ans<n){
            System.out.println(ans);
        }else {
            System.out.println(n);
        }

    }
}
