package com.example.algorithmpractice.bishi;

/**
 * @author YuanLi
 * @version 1.0
 * @date 2023/2/22 14:27
 */
public class t2 {
    public static void main(String[] args) {
        int cn=0;
        for (int i = 100; i < 1000; i++) {
            int one=i/100;
            int two=i%100/10;
            int three=i%10;
            int num=one*two*three;
            if(num==20){
                cn++;
            }
        }
        System.out.println(cn);
    }
}
