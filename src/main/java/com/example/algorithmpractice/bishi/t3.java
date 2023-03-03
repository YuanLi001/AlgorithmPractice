package com.example.algorithmpractice.bishi;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/2/22 14:41
 */
public class t3 {
    public static void main(String[] args) {
        int cn=0;
        for (int i = 1; i <= 199; i++) {
            for (int j = i+1; j <=199 ; j++) {
                System.out.println("["+i+","+j+"]");
                cn++;
            }
        }
        System.out.println(cn);
    }
}
