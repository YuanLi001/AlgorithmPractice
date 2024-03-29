package com.example.algorithmpractice.abishi.hengsheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2024/3/21 20:11
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isPri(num)){
            System.out.println("["+num+"]"+"是质数.");
        }else {
            System.out.println("["+num+"]"+"是合数.");
            List<Integer> list=priFactors(num);
            System.out.print(num+"=");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if(i< list.size()-1){
                    System.out.print("*");
                }
            }
        }

    }

    public static boolean isPri(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i*i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> priFactors(int n){
        List<Integer> list=new ArrayList<>();
        for (int i = 2; i*i <=n; i++) {
            while (n%i==0){
                list.add(i);
                n/=i;
            }
        }
        return list;
    }
}
