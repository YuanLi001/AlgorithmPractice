package com.example.algorithmpractice.shenxinfu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author lmy
 * @version 1.0
 * @date 2023/9/6 19:32
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        int size = set.size();
        int shangji=1;
        int xiaji=1;
        int sum=0;
        for (int i = 1; i<=size; i++) {
            shangji=(shangji*(size+1-i));
            xiaji=(xiaji*(i));
            sum=sum+shangji/xiaji;
        }
        System.out.println(sum);
    }
}
