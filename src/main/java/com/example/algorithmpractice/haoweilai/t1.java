package com.example.algorithmpractice.haoweilai;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/6 20:00
 */
public class t1 {
    public static void main(String[] args) {
//        System.out.println(digui(n));
        char a='\0';
        System.out.println("=========");
        System.out.println(a);
        System.out.println("=========");
    }

    public static int digui(int num){
        if(num==1){
            return 1;
        }else if(num==2){
            return 2;
        }
        return digui(num-1)+digui(num-2);
    }
}
